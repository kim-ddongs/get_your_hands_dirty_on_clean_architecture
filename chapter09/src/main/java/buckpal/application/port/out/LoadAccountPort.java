package buckpal.application.port.out;

import buckpal.domain.Account;
import buckpal.domain.Account.AccountId;

import java.time.LocalDateTime;

public interface LoadAccountPort {

	Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
