package buckpal.application.port.in;

public interface SendMoneyUseCase {
    boolean sendMoney(SendMoneyCommand command);

}
