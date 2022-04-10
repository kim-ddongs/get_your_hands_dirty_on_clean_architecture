package buckpal.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;
import buckpal.domain.Account.AccountId;

@Value
@RequiredArgsConstructor
@Getter
public class Activity {


	private ActivityId id;

	/**
	 * The account that owns this activity.
	 */
	@NonNull
	private final AccountId ownerAccountId;

	/**
	 * The debited account.
	 */
	@NonNull
	private final AccountId sourceAccountId;

	/**
	 * The credited account.
	 */
	@NonNull
	private final AccountId targetAccountId;

	/**
	 * The timestamp of the activity.
	 */
	@NonNull
	private final LocalDateTime timestamp;

	/**
	 * The money that was transferred between the accounts.
	 */
	@NonNull
	private final Money money;

	public Activity(
			@NonNull AccountId ownerAccountId,
			@NonNull AccountId sourceAccountId,
			@NonNull AccountId targetAccountId,
			@NonNull LocalDateTime timestamp,
			@NonNull Money money) {
		this.id = null;
		this.ownerAccountId = ownerAccountId;
		this.sourceAccountId = sourceAccountId;
		this.targetAccountId = targetAccountId;
		this.timestamp = timestamp;
		this.money = money;
	}

	@Value
	public static class ActivityId {
		private final Long value;
	}

}
