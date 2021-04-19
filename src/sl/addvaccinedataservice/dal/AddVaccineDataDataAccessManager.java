package sl.addvaccinedataservice.dal;

import dal.dao.VaccineRecordObject;
import sl.addvaccinedataservice.bll.blo.AddVaccineDataObject;
import sl.addvaccinedataservice.bll.blo.AddVaccineDataResultObject;
import sl.addvaccinedataservice.bll.blo.LoadVaccineDataObject;
import sl.addvaccinedataservice.bll.blo.LoadVaccineDataResultObject;

public class AddVaccineDataDataAccessManager {
    public VaccineRecordObject getVaccineRecordObject(AddVaccineDataObject addVaccineDataObject) {
        VaccineRecordObject vaccineRecordObject = new VaccineRecordObject();
        vaccineRecordObject.setID(addVaccineDataObject.id);
        vaccineRecordObject.setLastName(addVaccineDataObject.lastName);
        vaccineRecordObject.setFirstName(addVaccineDataObject.firstName);
        vaccineRecordObject.setVaccineType(addVaccineDataObject.vaccineType);
        vaccineRecordObject.setVaccinationDate(addVaccineDataObject.vaccinationDate);
        vaccineRecordObject.setVaccineLocation(addVaccineDataObject.vaccineLocation);
        return vaccineRecordObject;
    }

    public AddVaccineDataResultObject getAddVaccineDataResultObject(boolean successfullyAddedRecord) {
        AddVaccineDataResultObject addVaccineDataResultObject = new AddVaccineDataResultObject();
        addVaccineDataResultObject.successfullyAddedRecord = successfullyAddedRecord;
        return addVaccineDataResultObject;
    }

    public VaccineRecordObject[] getVaccineRecordObjects(LoadVaccineDataObject loadVaccineDataObject) {
        VaccineRecordObject[] vaccineRecordObjects = new VaccineRecordObject[loadVaccineDataObject.vaccineDataObjects.length];
        for (int vaccineRecordIndex = 0; vaccineRecordIndex < loadVaccineDataObject.vaccineDataObjects.length; ++vaccineRecordIndex)
            vaccineRecordObjects[vaccineRecordIndex] = getVaccineRecordObject(loadVaccineDataObject.vaccineDataObjects[vaccineRecordIndex]);
        return vaccineRecordObjects;
    }

    public LoadVaccineDataResultObject getLoadVaccineDataResultObject(boolean successfullyAddedRecords) {
        LoadVaccineDataResultObject loadVaccineDataResultObject = new LoadVaccineDataResultObject();
        loadVaccineDataResultObject.successfullyAddedRecords = successfullyAddedRecords;
        return loadVaccineDataResultObject;
    }
}