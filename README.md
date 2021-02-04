# Battery_Temp_Detector


BATTERY TEMPERATURE DETECTOR


Hrushikesh Reddy Kalyanam - 2092594

Table of Contents:

	Introduction: 
1)	Scope
2)	Purpose
3)	Project Set-up



	General Description:
1)	Product Functions
2)	User characteristics



	Specific Requirements:
1)	Functional requirements
2)	Non-functional requirements



	Test Cases



	Conclusion



	References





INTRODUCTION:

The Device battery temperature application is designed to give the temperature of the battery in any device. This application can be used without license and is specific to a device. The application is developed with help of temperature sensors and is accurate considering the external factors as well.
Technologies used:
Java, Android Studios, in-built temperature sensor.

•	SCOPE: The application helps the user to restrict the usage of the device based on the battery temperature. It also allows the user to be careful under extreme weather conditions where the device might behave strangely.

![Ta](https://user-images.githubusercontent.com/74370312/106900753-e6660180-66c4-11eb-9019-580b4f22ac7b.jpg)


•	PURPOSE: The application allows the user to detect and check their device battery temperature without the need of internet connection. We have come across several incidents where the device explodes due to vulnerable conditions and external factors. To overcome this I designed an application that keeps track of the device battery and can be check with a single click. The intention of this application is to keep the user informed about his device condition by showing the battery temperature.

 
 
•	PROJECT SET-UP: The GUI of the application is simple and user friendly. With low graphics and design the application was built to consume less memory and faster handling. Since the main aim is to track the temperature the core design of the app was focused only on giving the user what is necessary in times of emergency or need. The user can easily download the application within no time due to its small size. The application also doesn’t store any of user personal data thereby maintaining user data privacy. 

The project is built on basic JAVA and Sensor knowledge. The android studios platforms perfectly supported for the execution of this small sized user-friendly application. 


General Description:

There has been a plethora of studies on the effect of heat on batteries. These studies have shown that high temperatures jeopardize the performance, and lifecycle of the battery.
Studies have shown that for each 8°C rise in temperature, a sealed lead acid battery loses half of its lifecycle. Moreover, once the heat has damaged a battery, its capacity cannot be returned.
As mentioned, high-temperature issues in a battery do not only occur internally; they also happen externally. If a battery’s temperature is higher than the temperature of the environment around it, it can lose heat due to conduction, convection, and radiation. If the ambient temperature is higher than the internal temperature of a battery, then the battery becomes hotter.
Need for Temperature Sensors:
Temperature sensors are also needed on a battery because heat is generated whenever a battery is charged and increases the ambient heat and internal heat of the battery. Thus, a temperature sensor is needed on the battery charger because if the battery temperature is high; the charger reduces the voltage supply to ensure peak charging and prevents overheating of the battery. The charger uses a higher voltage to the battery at lower temperatures to offset the increased resistance caused by the low temperature.
 User Characteristics
•     A use of the application can be possible by the users with valid device.
•     Easy to use interface.
•	Small size application.
•	1-click display.
Product Functions
•	Device compatible
•	Sensor management
•	Accurate decimal round-off
•	A message display
•	Background color indication.

 

Note: The application displays a message along with the battery temperature for the user. This is a witty comment on the user’s device usage. Also, the background color of the screen changes with respect to the temperature ranges to indicate clearly for those who face trouble reading text at any given time.



Specific Requirements:
Requirement ID	Requirement Statement	Priority	Comments
FR1	A working device	High	The device is essential for the application
FR2	Android version 4.1 or above	High	The application is executable only in version 4.1 and above
NFR1	Security and Privacy	High	Pure data privacy 
NFR2	Memory	High	The app is designed to consume less memory
NFR3	Usability	High	Easy usage

In the above table FR indicates Functional requirements and NFR indicates non-functional requirements. The priority is set to indicate the necessity of that particular requirement.









Test Cases:

	With battery temperature less than 26 degrees Celsius the background color of the screen changes to blue and displays a message accordingly saying that the battery is cool.
The following image is a real time application GUI in my mobile device.

![WhatsApp Image 2021-02-04 at 8 52 09 AM](https://user-images.githubusercontent.com/74370312/106902044-604aba80-66c6-11eb-8b44-0b5e799d7003.jpeg)


 




	With battery temperature ranging between 26-30 degrees Celsius the display turns to green color and displays a message accordingly that says that the battery is currently stable but continued usage may cause the temperature to rise.

 





	With battery temperature rising above the threshold i.e., above 30 degrees Celsius the screen color changes to red in the background and displays a strict message to the user.

 




Conclusion:
The battery temperature application help you take precaution against the troubles such as battery swelling due to overheating. A battery operates best between the temperatures of 18°C to 25°C. As temperature rises in a battery, the chemical reaction is quicker. This permits the battery's output to improve. Although, if the chemical reaction is too fast, then the chemicals may be lost, and this decreases the life of the battery. To enhance the battery life and usability, I have designed this application that monitors your battery temperature.



References:
Concept reference:  
Class, Pdf, and book references.

Information/data reference:  
https://theaccessway.com/monitor-battery-temperature/
www.sciencedirect.com



Thank you

