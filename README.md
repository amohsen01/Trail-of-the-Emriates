# Trail-of-the-Emirates


OPEN GIT BASH
To work on code:
```

git clone https://github.com/amohsen01/Trail-of-the-Emriates.git TOTE
```

To update local file:
Go to file and type:

```
git pull

```

After finishing:
```
git add .
git commit -m "name, what is added " //ex. Ali Landmarka Added
git push
```

Overview of the game:
	The idea of the game is inspired by the game “The Oregon Trail'' where one traveler would start at Ajman and would have to travel to Abu Dhabi with a limited time frame. Finishing a business trip in Ajman, the player needs to visit the landmarks in each Emirate within a specified amount of time to catch their flight. The player may choose to travel by taxi or walking in which each option would give different outputs for the game since each transportation varies in time consumption. The game will have collectibles that would be available at each emirate that will add to the player’s score. The game will use sensors connected to the player’s phone in order to control certain aspects of the game.


Description of the game components (These may change overtime:
Objective:
The player will have to try to get the collectibles by visiting the landmarks and getting some help from the characters to be able to reach the final destination which is Abu Dhabi International Airport within a specified time frame.


Scenes
Al Zorah Beach  (Ajman) //
Souq Al Qadeem  (Sharjah)
Burj Khalifa  (Dubai)
Abu Dhabi Airport  (Abu Dhabi)

Objects
Dallah (coffee pot)
Dates  //optional if the traveler wants to buy it in the Airport
Oud 
Picture at Burj Khalifa
Taxi
 Phone
Characters 	
 Flight Attendant
 Hotel Lobbyist
 Photographer 
Swiper ( steals collectibles )

Sensors
Accelerometer 
Gyroscope Sensor/Device Orientation 
Sound sensor 

Using Design Patterns 
Observer
Watch subject to countdown remaining time is the subject while the flight attendant as an observer to call the player every hour.

Singleton 
Clock class
Player
 
Using sensors 
Talking to the characters (give different commands to each).
Waving for a taxi driver, shout out taxi (when the player exits the landmark, a taxi will appear, if the phone was waved at a given time the player will enter the taxi).
Picking up the collectibles.


![alt text](https://i.ibb.co/TcbkhYy/Class-Diagram.png)

