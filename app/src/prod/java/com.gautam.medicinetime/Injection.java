package com.yoshualukas.EPillzz;

import android.content.Context;
import androidx.annotation.NonNull;


import com.yoshualukas.EPillzz.data.source.MedicineRepository;
import com.yoshualukas.EPillzz.data.source.local.MedicinesLocalDataSource;


public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}