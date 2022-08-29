package core.basesyntax.strategy.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.strategy.FruitOperation;

public class FruitBalanceOperation implements FruitOperation {
    @Override
    public void operate(String fruitName, int amount, StorageDao storageDao) {
        storageDao.add(fruitName, amount);
    }
}
