package com.yoshualukas.EPillzz.addmedicine;

import com.yoshualukas.EPillzz.BasePresenter;
import com.yoshualukas.EPillzz.BaseView;
import com.yoshualukas.EPillzz.data.source.MedicineAlarm;
import com.yoshualukas.EPillzz.data.source.Pills;

import java.util.List;


public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}
