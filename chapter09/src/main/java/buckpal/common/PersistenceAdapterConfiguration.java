package buckpal.common;

import buckpal.adapter.persistence.AccountMapper;
import buckpal.adapter.persistence.AccountPersistenceAdapter;
import buckpal.adapter.persistence.AccountRepository;
import buckpal.adapter.persistence.ActivityRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
class PersistenceAdapterConfiguration {
    @Bean
    AccountPersistenceAdapter accountPersistenceAdapter(
            AccountRepository accountRepository,
            ActivityRepository activityRepository,
            AccountMapper accountMapper
    ) {
        return new AccountPersistenceAdapter(
                accountRepository,
                activityRepository,
                accountMapper
        );
    }

    @Bean
    AccountMapper accountMapper() {
        return new AccountMapper();
    }
}
