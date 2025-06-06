package com.karan.project.ride.rideHailingApp.services;

import com.karan.project.ride.rideHailingApp.entities.Ride;
import com.karan.project.ride.rideHailingApp.entities.User;
import com.karan.project.ride.rideHailingApp.entities.Wallet;
import com.karan.project.ride.rideHailingApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);

}
