# Get-Your-Vaccine
An Applications which gives you information about slot availability of covid vaccine

# Overview
This is a vaccine tracker android app which displays the details of vaccination centers with vaccine availibility. 
It ask user for their area pincode and pick the date on which user wants to check vaccine availability and return data like vaccination center name, address, vaccine name, vaccine fee type, available vaccines, and timings.

# TechStack Used
1. Langauge - Kotlin
2. Framework - AndroidStudio
3. For Api calls and responses - [Volley Library](https://developer.android.com/training/volley)
4. Api from - [Api Setu](https://apisetu.gov.in/#)

# Projects Files
1. MainActivity(Opening Activity) - Used to enter pincodeand date. Also has a search button to initiate search.
2. Vaccine - A constructor class used to holds the data which are to be shown in adapter.
3. VaccineSlotAdapter - A adapter class which creates a adapter and bind data to it.
4. VaccineSlots - A class which holds recyclerView and to show to data
5. VolleySingleton - A singleton class which is used to create only instance of volley

# API Used
Api from api setu:- https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/calendarByPin?pincode=$pinCode&date=$date

# Screenshots
[screenshots](https://github.com/Vishnu-Murti-Pandey/Get-Your-Vaccine/tree/master/screenshots)
