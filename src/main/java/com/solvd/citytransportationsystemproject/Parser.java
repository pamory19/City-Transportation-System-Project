package com.solvd.citytransportationsystemproject;

import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StAXParsingExample {
	final static Logger logger = LogManager.getLogger(StAXParsingExample.class.getName());
	private accidentReport accidentReport;	
	private date date;
	private description description;
	private personID personID;
	private vehicleID vehicleID;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private bus bus;
	private busNumber busNumber;
	private vehicleID vehicleID;

	public void parseXML() {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("AccidentReport.xml"));
			while (reader.hasNext()) {
				int event = reader.next();
				switch (event) {	
				case XMLStreamConstants.START_ELEMENT:
					if (reader.getLocalName().equalsIgnoreCase("accidentReport")) {
						accidentReport = new accidentReport();
					} else if (reader.getLocalName().equalsIgnoreCase("description")) {
						accidentReport.setdescription(new ArrayList<>());
					} else if (reader.getLocalName().equalsIgnoreCase("description")) {
						accidentReport = new description();
					} else if (reader.getLocalName().equalsIgnoreCase("personID")) {
						accidentReport.setpersonID(new ArrayList<>());
					} else if (reader.getLocalName().equalsIgnoreCase("personID")) {
						personID = new personID();
					} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
						accidentReport.setpersonID(new ArrayList<>());
					} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
						personID = new personID();
					} else if (reader.getLocalName().equalsIgnoreCase("date")) {
						accidentReport.setdate(new ArrayList<>());
					} else if (reader.getLocalName().equalsIgnoreCase("date")) {
						date = new date();
					}
					break;
					
				case XMLStreamConstants.CHARACTERS:
					String data = reader.getText().trim();
					if (accidentReport != null && accidentReport.getId() == 0) {
						accidentReport.setId(Long.parseLong(data));
					} else if (description != null && description.getdescription() == null) {
						description.setdescription(data);
					} else if (personID != null && personID.getpersonID() == null) {
						personID.setpersonID(data);
					} else if (vehicleID != null && vehicleID.getvehicleID() == null) {
						vehicleID.setvehicleID(data);
					} else if (date != null && date.getdate() == null) {
						date.setdate(data);
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					if (reader.getLocalName().equalsIgnoreCase("accidentReport")) {
					} else if (reader.getLocalName().equalsIgnoreCase("description")) {
						accidentReport.getdescription().add(description);
						description = null;
					} else if (reader.getLocalName().equalsIgnoreCase("personID")) {
						accidentReport.getpersonID().add(personID);
						personID = null;
					} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
						accidentReport.getvehicleID().add(vehicleID);
						personID = null;
					} else if (reader.getLocalName().equalsIgnoreCase("date")) {
						accidentReport.getdate().add(date);
						date = null;
					}
					break;
				}
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}
	try {
		XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("AccidentReportMapper.xml"));
		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {	
			case XMLStreamConstants.START_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("bus")) {
					bus = new bus();
				} else if (reader.getLocalName().equalsIgnoreCase("busNumber")) {
					bus.setbusNumber(new ArrayList<>());
				} else if (reader.getLocalName().equalsIgnoreCase("busNumber")) {
					busNumber = new busNumber();
				} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
					bus.setvehicleID(new ArrayList<>());
				} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
					vehicleID = new vehicleID();
				}	
				break;
					
				case XMLStreamConstants.CHARACTERS:
					String data = reader.getText().trim();
					if (bus != null && bus.getId() == 0) {
						bus.setId(Long.parseLong(data));
					} else if (busNumber != null && busNumber.getbusNumber() == null) {
						busNumber.setbusNumber(data);
					} else if (vehicleID != null && vehicleID.getvehicleID() == null) {
						vehicleID.setvehicleID(data);
					break;
				case XMLStreamConstants.END_ELEMENT:
					if (reader.getLocalName().equalsIgnoreCase("bus")) {
					} else if (reader.getLocalName().equalsIgnoreCase("description")) {
						bus.getvehicleID().add(vehicleID);
						description = null;
					} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
						accidentReport.getvehicleID().add(vehicleID);
						personID = null;
					}
					break;
				}
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}
	try {
		XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("BusMapper.xml"));
		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {	
			case XMLStreamConstants.START_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("driver")) {
					driver = new driver();
				} else if (reader.getLocalName().equalsIgnoreCase("liscenseNumber")) {
					driver.setliscenseNumber(new ArrayList<>());
				} else if (reader.getLocalName().equalsIgnoreCase("liscenseNumber")) {
					liscenseNumber = new liscenseNumber();
				} else if (reader.getLocalName().equalsIgnoreCase("yearsOfExperience")) {
					driver.setyearsOfExperience(new ArrayList<>());
				} else if (reader.getLocalName().equalsIgnoreCase("yearsOfExperience")) {
					yearsOfExperience = new yearsOfExperience();
				  else if (reader.getLocalName().equalsIgnoreCase("personID")) {
					driver.setpersonID(new ArrayList<>());
				} else if (reader.getLocalName().equalsIgnoreCase("personID")) {
					personID = new personID();
				}	
				break;
					
				case XMLStreamConstants.CHARACTERS:
					String data = reader.getText().trim();
					if (driver != null && driver.getId() == 0) {
						driver.setId(Long.parseLong(data));
					} else if (liscenseNumber != null && liscenseNumber.getliscenseNumber() == null) {
						liscenseNumber.setliscenseNumber(data);
					} else if (yearsOfExperience != null && yearsOfExperience.getyearsOfExperience() == null) {
						yearsOfExperience.setyearsOfExperience(data);
					} else if (personID != null && personID.getpersonID() == null) {
						personID.setpersonID(data);
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					if (reader.getLocalName().equalsIgnoreCase("driver")) {
					} else if (reader.getLocalName().equalsIgnoreCase("liscenseNumber")) {
						driver.getliscenseNumber().add(liscenseNumber);
						description = null;
					} else if (reader.getLocalName().equalsIgnoreCase("yearsOfExperience")) {
						driver.getyearsOfExperience().add(yearsOfExperience);
						yearsOfExperience = null;
					}
					else if (reader.getLocalName().equalsIgnoreCase("personID")) {
						driver.getpersonID().add(personID);
						personID = null;
					}
					break;
				}
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	try {
		XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("PassengerMapper.xml"));
		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {	
			case XMLStreamConstants.START_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("passenger")) {
					passenger = new passenger();
				} else if (reader.getLocalName().equalsIgnoreCase("numberOfRides")) {
					passenger.setnumberOfRides(new ArrayList<>());
				} else if (reader.getLocalName().equalsIgnoreCase("numberOfRides")) {
					numberOfRides = new numberOfRides();
				} else if (reader.getLocalName().equalsIgnoreCase("personID")) {
					passenger.setpersonID(new ArrayList<>());
				} else if (reader.getLocalName().equalsIgnoreCase("personID")) {
					personID = new personID();
				}	
				break;
					
				case XMLStreamConstants.CHARACTERS:
					String data = reader.getText().trim();
					if (passenger != null && passenger.getId() == 0) {
						passenger.setId(Long.parseLong(data));
					} else if (numberOfRides != null && numberOfRides.getnumberOfRides() == null) {
						numberOfRides.setnumberOfRides(data);
					} else if (personID != null && personID.getpersonID() == null) {
						personID.setpersonID(data);
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					if (reader.getLocalName().equalsIgnoreCase("passenger")) {
					} else if (reader.getLocalName().equalsIgnoreCase("numberOfRides")) {
						passenger.getnumberOfRides().add(numberOfRides);
						numberOfRides = null;
					} 
					else if (reader.getLocalName().equalsIgnoreCase("personID")) {
						passenger.getpersonID().add(personID);
						personID = null;
					}
					break;
				}
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}

try {
	XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("RouteMapper.xml"));
	while (reader.hasNext()) {
		int event = reader.next();
		switch (event) {	
		case XMLStreamConstants.START_ELEMENT:
			if (reader.getLocalName().equalsIgnoreCase("route")) {
				route = new route();
			} else if (reader.getLocalName().equalsIgnoreCase("name")) {
				route.setname(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("name")) {
				name = new name();
			} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
				route.setvehicleID(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
				vehicleID = new vehicleID();
			}	
			else if (reader.getLocalName().equalsIgnoreCase("stations")) {
				route.setstations(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("stations")) {
				stations = new stations();
			}	
			break;
				
			case XMLStreamConstants.CHARACTERS:
				String data = reader.getText().trim();
				if (route != null && route.getId() == 0) {
					route.setId(Long.parseLong(data));
				} else if (name != null && name.getname() == null) {
					name.setname(data);
				} else if (vehicleID != null && vehicleID.getvehicleID() == null) {
					vehicleID.setvehicleID(data);
				}
				else if (stations != null && stations.getstations() == null) {
					stations.setstations(data);
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("route")) {
				} else if (reader.getLocalName().equalsIgnoreCase("name")) {
					route.getname().add(name);
					name = null;
				} 
				else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
					route.getvehicleID().add(vehicleID);
					vehicleID = null;
				}
				else if (reader.getLocalName().equalsIgnoreCase("stations")) {
					route.getstations().add(stations);
					stations = null;
				}
				break;
			}
		}
	} catch (Exception e) {
		logger.error(e);
	}
}

try {
	XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("stationMapper.xml"));
	while (reader.hasNext()) {
		int event = reader.next();
		switch (event) {	
		case XMLStreamConstants.START_ELEMENT:
			if (reader.getLocalName().equalsIgnoreCase("station")) {
				station = new station();
			} else if (reader.getLocalName().equalsIgnoreCase("name")) {
				station.setname(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("name")) {
				name = new name();
			} else if (reader.getLocalName().equalsIgnoreCase("type")) {
				station.settype(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("type")) {
				type = new type();
			}	
			else if (reader.getLocalName().equalsIgnoreCase("address")) {
				station.setaddress(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("address")) {
				address = new address();
			}	
			else if (reader.getLocalName().equalsIgnoreCase("routeID")) {
				station.setrouteID(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("routeID")) {
				routeID = new routeID();
			}	
			break;
				
			case XMLStreamConstants.CHARACTERS:
				String data = reader.getText().trim();
				if (station != null && station.getId() == 0) {
					station.setId(Long.parseLong(data));
				} else if (name != null && name.getname() == null) {
					name.setname(data);
				} else if (type != null && type.gettype() == null) {
					type.settype(data);
				}
				else if (address != null && address.getaddress() == null) {
					address.setaddress(data);
				}
				else if (routeID != null && routeID.getrouteID() == null) {
					routeID.setrouteID(data);
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("station")) {
				} else if (reader.getLocalName().equalsIgnoreCase("name")) {
					station.getname().add(name);
					name = null;
				} 
				else if (reader.getLocalName().equalsIgnoreCase("type")) {
					station.gettype().add(type);
					type = null;
				}
				else if (reader.getLocalName().equalsIgnoreCase("address")) {
					station.getaddress().add(address);
					address = null;
				}
				else if (reader.getLocalName().equalsIgnoreCase("routeID")) {
					station.getrouteID().add(routeID);
					routeID = null;
				}
				break;
			}
		}
	} catch (Exception e) {
		logger.error(e);
	}
}

try {
	XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("TaxiMapper.xml"));
	while (reader.hasNext()) {
		int event = reader.next();
		switch (event) {	
		case XMLStreamConstants.START_ELEMENT:
			if (reader.getLocalName().equalsIgnoreCase("Taxi")) {
				Taxi = new Taxi();
			} else if (reader.getLocalName().equalsIgnoreCase("licensePlate")) {
				Taxi.setlicensePlate(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("licensePlate")) {
				licensePlate = new licensePlate();
			}	
			else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
				Taxi.setvehicleID(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
				vehicleID = new vehicleID();
			}	
			break;
				
			case XMLStreamConstants.CHARACTERS:
				String data = reader.getText().trim();
				if (Taxi != null && Taxi.getId() == 0) {
					Taxi.setId(Long.parseLong(data));
				} else if (licensePlate != null && licensePlate.getlicensePlate() == null) {
					licensePlate.setlicensePlate(data);
				} else if (vehicleID != null && vehicleID.gettype() == null) {
					vehicleID.setvehicleID(data);
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("Taxi")) {
				} else if (reader.getLocalName().equalsIgnoreCase("licensePlate")) {
					Taxi.getlicensePlate().add(licensePlate);
					licensePlate = null;
				} 
				else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
					Taxi.getvehicleID().add(vehicleID);
					vehicleID = null;
				}
				break;
			}
		}
	} catch (Exception e) {
		logger.error(e);
	}
}

try {
	XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("TrainMapper.xml"));
	while (reader.hasNext()) {
		int event = reader.next();
		switch (event) {	
		case XMLStreamConstants.START_ELEMENT:
			if (reader.getLocalName().equalsIgnoreCase("Train")) {
				Train = new Train();
			} else if (reader.getLocalName().equalsIgnoreCase("TrainHeadcode")) {
				Train.settrainHeadcode(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("TrainHeadcode")) {
				trainHeadcode = new trainHeadcode();
			}	
			else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
				Train.setvehicleID(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
				vehicleID = new vehicleID();
			}	
			break;
				
			case XMLStreamConstants.CHARACTERS:
				String data = reader.getText().trim();
				if (Train != null && Train.getId() == 0) {
					Train.setId(Long.parseLong(data));
				} else if (TrainHeadcode != null && TrainHeadcode.getTrainHeadcode() == null) {
					TrainHeadcode.setTrainHeadcode(data);
				} else if (vehicleID != null && vehicleID.gettype() == null) {
					vehicleID.setvehicleID(data);
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("Train")) {
				} else if (reader.getLocalName().equalsIgnoreCase("TrainHeadcode")) {
					Train.getTrainHeadcode().add(TrainHeadcode);
					TrainHeadcode = null;
				} 
				else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
					Train.getvehicleID().add(vehicleID);
					vehicleID = null;
				}
				break;
			}
		}
	} catch (Exception e) {
		logger.error(e);
	}
}

try {
	XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("VehicleMaintenanceMapper.xml"));
	while (reader.hasNext()) {
		int event = reader.next();
		switch (event) {	
		case XMLStreamConstants.START_ELEMENT:
			if (reader.getLocalName().equalsIgnoreCase("VehicleMaintenance")) {
				VehicleMaintenance = new VehicleMaintenance();
			} else if (reader.getLocalName().equalsIgnoreCase("date")) {
				date.setdate(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("date")) {
				date = new date();
			}	
			else if (reader.getLocalName().equalsIgnoreCase("type")) {
				type.settype(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("type")) {
				type = new type();
			}	
			else if (reader.getLocalName().equalsIgnoreCase("description")) {
				type.setdescription(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("description")) {
				description = new description();
			}	
			else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
				type.setvehicleID(new ArrayList<>());
			} else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
				vehicleID = new vehicleID();
			}	
			break;
				
			case XMLStreamConstants.CHARACTERS:
				String data = reader.getText().trim();
				if (VehicleMaintenance != null && VehicleMaintenance.getId() == 0) {
					VehicleMaintenance.setId(Long.parseLong(data));
				} else if (date != null && date.getdate() == null) {
					date.setdate(data);
				} 
				else if (type != null && type.gettype() == null) {
					type.settype(data);
				}
				else if (description != null && description.getdescription() == null) {
					description.setdescription(data);
				}
				else if (vehicleID != null && vehicleID.gettype() == null) {
					vehicleID.setvehicleID(data);
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("VehicleMaintenance")) {
				} else if (reader.getLocalName().equalsIgnoreCase("date")) {
					VehicleMaintenance.getdate().add(date);
					date = null;
				} 
				else if (reader.getLocalName().equalsIgnoreCase("type")) {
					VehicleMaintenance.gettype().add(type);
					type = null;
				} 
				else if (reader.getLocalName().equalsIgnoreCase("description")) {
					VehicleMaintenance.getdescription().add(description);
					description = null;
				} 
				else if (reader.getLocalName().equalsIgnoreCase("vehicleID")) {
					VehicleMaintenance.getvehicleID().add(vehicleID);
					vehicleID = null;
				}
				break;
			}
		}
	} catch (Exception e) {
		logger.error(e);
	}
}






}
}
