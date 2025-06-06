package com.karan.project.ride.rideHailingApp.strategies;

import com.karan.project.ride.rideHailingApp.entities.enums.PaymentMethod;
import com.karan.project.ride.rideHailingApp.strategies.impl.CashPaymentStrategy;
import com.karan.project.ride.rideHailingApp.strategies.impl.WalletPaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentStrategyManager {

    private final WalletPaymentStrategy walletPaymentStrategy;
    private final CashPaymentStrategy cashPaymentStrategy;

    public PaymentStrategy paymentStrategy(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case WALLET -> walletPaymentStrategy;
            case CASH -> cashPaymentStrategy;
        };
    }
}
