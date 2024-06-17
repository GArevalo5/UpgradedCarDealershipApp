# UpgradedCarDealershipApp
A console-based dealership application with straightforward features that was upgraded to use a database instead of a csv. It has one screen(currently) that has options for buy/lease(still in progress),Find vehicles within a price range(still in progress), Find vehicle by color,find by mileage range(still in progress),find vehicle by type, list all vehicles, add vehicle(still in progress), remove by vehicle and exiting out.   

6-14-24
I spent most of the day trying to move over code and getting the main screen to function again while setting it up to use a database. I was able to at least get it to run and setup what classes I think I would need. I still need to redo the database that it's linked to. Some of the data required in the application isn't in the database so that'll have to be reworked still. In the meantime it can run and has a few of it's options running again although it won't lead to anything quite yet.
Picture below are of the classes made today (1st screenshot) and The home screen(HomeView) the user would see.

![alt text](<classes in application.jpg>)

![alt text](HomeView.jpg)

bugs and issues: N/A

6-15-24

Today I have added the getall(), searchByModel() and searchByColor() to MySqlVehicleDao and adding them to VehicleController. I had to update some of the MySql scripts that I used for the database this application uses. Along with editing the vehicle class so that it worked with the database and the new classes. Right now the only ones written are the search by color,type, model and show all cars.

bugs or issues: N/A 

![alt text](mySqlVehicleDaoGettAllFunnction.jpg)

6-16-24

Added Views for searchByModel,searchByColor and searchbyType. Dosen't work quite yet ,but they are setup just need to tweak it so it does the search correctly.

bugs and issues : The searches don't work correctly yet.