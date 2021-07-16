package com.yoshualukas.EPillzz.alarm;

import com.yoshualukas.EPillzz.BasePresenter;
import com.yoshualukas.EPillzz.BaseView;
import com.yoshualukas.EPillzz.data.source.History;
import com.yoshualukas.EPillzz.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
