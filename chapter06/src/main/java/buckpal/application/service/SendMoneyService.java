package buckpal.application.service;

import buckpal.application.port.in.SendMoneyCommand;
import buckpal.application.port.in.SendMoneyUseCase;
import buckpal.application.port.out.AccountLock;
import buckpal.application.port.out.LoadAccountPort;
import buckpal.application.port.out.UpdateAccountStatePort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
public class SendMoneyService implements SendMoneyUseCase {
    private final LoadAccountPort loadAccountPort;
    private final AccountLock accountLock;
    private final UpdateAccountStatePort updateAccountStatePort;

    @Transactional
    @Override
    public boolean sendMoney(SendMoneyCommand command) {
        //TODO: 비즈니스 규칙 검증
        //TODO: 모델 상태 조작
        //TODO: 출력 값 반환
        return false;
    }
}
