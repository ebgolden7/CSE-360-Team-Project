package dal;

import dal.dao.VaccineRecordObject;
import java.util.ArrayList;
import java.util.List;

public class VaccineRecordTable extends RecordTable<VaccineRecordObject> {
    private static List<VaccineRecordObject> vaccineRecordTable = new ArrayList<>();

    @Override
    public boolean addRecord(VaccineRecordObject record) {
        boolean recordWithIDExists = recordWithIDExists(record);
        if (recordWithIDExists)
            return false;
        vaccineRecordTable.add(record);
        return true;
    }

    @Override
    protected boolean recordWithIDExists(VaccineRecordObject record) {
        return vaccineRecordTable.stream().anyMatch(recordInTable -> recordInTable.getID() == record.getID());
    }

    @Override
    public VaccineRecordObject[] getRecords() {
        VaccineRecordObject[] vaccineRecordTableArray = new VaccineRecordObject[vaccineRecordTable.size()];
        vaccineRecordTableArray = vaccineRecordTable.toArray(vaccineRecordTableArray);
        return vaccineRecordTableArray;
    }
}