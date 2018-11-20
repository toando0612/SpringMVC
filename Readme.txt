 Do Quoc Toan - S3652979 - Assignment 2
 CRUD calls on your service endpoints:

***Input(POST) to Patient Management in order: 
Patient-->Visit-->Icdinfo-->Prescription-->DrugInfo

***Delete from Patient Management in order:
DrugInfo-->IcdInfo-->Visit-->Patient

+++++Count Number of patient visit by date: 
localhost:8080/visits/countbydate/23-08-2018

+++++GetPatientByBirthday: localhost:8080/patients/findbybirthday/06-12-1994

+++++GetPatientByName:  localhost:8080/patients/findbyname/toan

+++++GetVisitByDate : localhost:8080/visits/findbydate/23-08-2018

+++++GetVisitByPatientId: localhost:8080/visits/findbypatient/1

++Patient:

POST: localhost:8080/patients

Body: {	
	"name":"toan",
	"birthday":"06-12-1994",
	"address":"District7",
	"gender":"male"
    }

 

GETAll: localhost:8080/patients

GET: localhost:8080/patients/1


DELETE: localhost:8080/patients/1

PUT: localhost:8080/patients

Body: {	"id":1,
	"name":"toan",
	"birthday":"06-12-1994",
	"address":"District7",
	"gender":"male"
    }

++Visit:

POST: localhost:8080/visits

Body: {
	"problems":"headache, stomachache",
	"patient":{"id":1},
	"icd":{"id":1}
}

 

GETAll: localhost:8080/visits

GET: localhost:8080/visits/1

DELETE: localhost:8080/visits/1

PUT: localhost:8080/visits

Body: {
	"id":1,
	"problems":"headache, stomachache",
	"patient":{"id":1},
	"icd":{"id":1}
}
++IcdInfo:

POST: localhost:8080/icdinfos

Body: {
	"icd":{"id":1},
	"visit":{"id":1}
}

 

GETAll: localhost:8080/icdinfos


GET: localhost:8080/icdinfos/1

DELETE: localhost:8080/icdinfos/1

PUT: localhost:8080/icdinfos

Body: {"id":1,
	"icd":{"id":1},
	"visit":{"id":1}
}
++Prescription:

POST: localhost:8080/prescriptions

Body: {
    "dose": "3 tablets per day",
    "howtouse": "after a meal",
    "patient":{"id":1}
	
}

 

GETAll: localhost:8080/prescriptions

GET: localhost:8080/prescriptions/1

DELETE: localhost:8080/prescriptions/1

PUT: localhost:8080/prescriptions

Body: {
	"id":1,
    "dose": "3 tablets per day",
    "howtouse": "after a meal",
    "patient":{"id":1}
	
}
++DrugInfo:

POST: localhost:8080/druginfos

Body: {	
	"quantity":20,
	"drug":{"id":1},
	"prescription":{"id":1}
}

 

GETAll: localhost:8080/druginfos

GET: localhost:8080/druginfos/1

DELETE: localhost:8080/druginfos/1

PUT: localhost:8080/druginfos

Body: {	"id":1,
	"quantity":25,
	"drug":{"id":1},
	"prescription":{"id":1}
}

++Drug:

POST: localhost:8080/drugs

Body: {
    "name": "Diazepam"
}

 

GETAll: localhost:8080/drugs

GET: localhost:8080/drugs/1

DELETE: localhost:8080/drugs/1

PUT: localhost:8080/drugs

Body: {
    "id": 1,
    "name": "Paracetamol"
}




