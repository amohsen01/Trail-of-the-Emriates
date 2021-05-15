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
 The Trail of the Emirates is based on the player trying to get the collectibles by visiting the landmarks, the player starts the game by checking out of the hotel, to start the journey the player would have to request to checkout from the hotel lobbyist (i want to checkout), after that the journey starts. The player starts by catching a taxi, by calling the word taxi and waving with the use of 2 sensors. After that the player will be asked for their destination ( by typing into  the console ), if they were to request any landmark other than the nearest landmark (starting from ajman which will be al zorah beach ) the user would be prompted to choose the nearest landmark. Once the player chooses the correct nearest landmark, they would be notified that they reach their destination, the player would then type explore, once they do that a description of the landmark would appear and would mention that there are some collectibles and would ask the user if they want to collect them or not if user they would pick them up by the sensor. Once the user collects the collectibles the user would be notified that the Swiper wants to steal their collectible and they have to hide their collectible by typing hide *item* or do not hide *item*, if the user does not hide their collectibles Swiper would steal them away. Once the user hides their collectibles, they would be prompted that their collectibles are safe now and they can proceed to the next destination. Next the user would be prompted to input their next destination, if they were to request any landmark other than the nearest landmark the user would be prompted to choose the nearest landmark. Once the player chooses the correct nearest landmark, they would be notified that they reached their destination, and then the user would explore, get asked if they would like to collect collectibles, and hide their items from the swiper, this would happen for all the landmarks until they reach the final destination which is Abu Dhabi Airport. Once they have reached Abu Dhabi Airport, the user would be notified that they are officially safe from Swiper and have to catch their flight immediately,so the user would hand their passport to the flight attendant by typing hand passport, and then would have to rotate their phone to enter the plane’s gate. Once they have done that, the user would be prompted to have a safe flight and the game would end.



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

