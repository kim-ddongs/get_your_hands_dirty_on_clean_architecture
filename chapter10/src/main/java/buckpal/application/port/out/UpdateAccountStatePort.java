package buckpal.application.port.out;

import buckpal.domain.Account;

public interface UpdateAccountStatePort {

	void updateActivities(Account account);

}