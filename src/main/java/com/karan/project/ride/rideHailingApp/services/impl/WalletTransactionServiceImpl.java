package com.karan.project.ride.rideHailingApp.services.impl;

import com.karan.project.ride.rideHailingApp.entities.WalletTransaction;
import com.karan.project.ride.rideHailingApp.repositories.WalletTransactionRepository;
import com.karan.project.ride.rideHailingApp.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }

}
