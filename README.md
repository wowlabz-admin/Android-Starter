**Android Starter**
================
Android Starter is a module that we use internally in our projects.
It takes care of all basic setup and scaffolding needed, as per best practices that we have come across thus far.
Simply integrate it into your project and get started!

---

Included in this module:
-------------

 1. **Build Helper**
 2. **Retrofit Builder**
 3. **API Handler**
 4. **Base URL Helper**
 5. **JSON Helper**
 6. **End-Point Config**
 7. **Pagination Helper**
 8. **Logger**
 9. **Session Handler**
 10. **Screen Density Conversion Helper**
 11. **Date Helper**
 12. **HTML Helper**
 13. **String Helper**
 14. **Network Connectivity Helper**
 15. **ID Generator**
 16. **Dimension Config.**
 17. **Widget Style Config.**
 18. **Misc. Config.**
 19. **App Compat**
 20. **Card View**
 21. **Recycler View**
 22. **Facebook SDK**
 23. **Google Auth SDK**
 24. **Custom Font Config.**
 25. **ORM**

---

Integration:
-------------

 1. Open your Android Studio project.
 2. Select Project Structure from the File menu on Android.![enter image description here](https://lh3.googleusercontent.com/-IAYeKkjbxDM/WR6uhzlQ17I/AAAAAAAAAkA/s-QeWyw8uPgHYouq32p24o9y0I6KzIFJACLcB/s0/Screen+Shot+2017-05-18+at+4.39.54+PM.png "Screen Shot 2017-05-18 at 4.39.54 PM.png")
 3. Click on the + icon present at the top left corner and select Import Gradle Project before clicking Next.![enter image description here](https://lh3.googleusercontent.com/-Z7In3MckgG8/WR6uq_reOyI/AAAAAAAAAkI/DNawTLi5Fxk2NWNbAOrX-J355t391IncgCLcB/s0/Screen+Shot+2017-05-18+at+4.49.15+PM.png "Screen Shot 2017-05-18 at 4.49.15 PM.png")
 4. After clicking Next button a new screen appears and asks you to specify the Source directory of your module.
 5. Set the Source directory path of your Gradle project module and change the Module name if required after checking the import checkbox.![enter image description here](https://lh3.googleusercontent.com/-SVlGfn8Vbms/WR6u0fDYd7I/AAAAAAAAAkQ/r7UcwGddECQP0bFVSgRfNj2S-cyaJNjlACLcB/s0/Screen+Shot+2017-05-18+at+4.53.26+PM.png "Screen Shot 2017-05-18 at 4.53.26 PM.png")
 6. Click Finish button to proceed and add the Gradle project module and then click OK to see if the module is added in the Project Explorer.
 7. Repeat Step 2.
 8. Select your project app folder and then select the Dependencies tab.
 9. Now, click on the + icon at the bottom of the Dependencies tab and select Module Dependency.![enter image description here](https://lh3.googleusercontent.com/-HkbQUMbsVis/WR6u82auG0I/AAAAAAAAAkY/UN1jW5gxxagAZxXCyzZ62KuD-9aj4WoKwCLcB/s0/Screen+Shot+2017-05-18+at+4.46.27+PM.png "Screen Shot 2017-05-18 at 4.46.27 PM.png")
 10. A new screen appears to select the module that you have added to your project.
 11. Select the Gradle project module from the list of available module and click on OK button at the bottom right corner.![enter image description here](https://lh3.googleusercontent.com/-1Hn8Uqgv-UE/WR6vFNVSLJI/AAAAAAAAAkg/ilmAI4XGbLQwidv-RMCSedEGeitZaP2FQCLcB/s0/Screen+Shot+2017-05-18+at+5.08.07+PM.png "Screen Shot 2017-05-18 at 5.08.07 PM.png")
 12. Now, click on the OK button again present at the bottom right corner and now you are done integrating the module as a dependency.

---
 
Details:
-------------
1. __Build Helper__
Helper class to initialize the SDK and apply few basic settings like: Enable/Disable debug mode and setting build type to Poduction/Staging.
> __Utitlity/Helper Class__
> AppHelper.java

2. __Retrofit Builder__
Instance which uses the interface and the Builder API which allows defining the URL end point for the HTTP operation.
> __Utitlity/Helper Class__
> AppClient.java
> 
> __Libraries__
> com.squareup.retrofit2:retrofit:2.2.0
> com.squareup.retrofit2:converter-gson:2.2.0
> com.squareup.okhttp3:okhttp-urlconnection:3.6.0
> com.squareup.okhttp3:logging-interceptor:3.6.0

3. __API Handler__
Interfaces which defines the possible HTTP operations.
Every method of an interface represents one possible API call. It must have a HTTP annotation (GET, POST, etc.) to specify the request type and the relative URL. The return value wraps the response in a Call object with the type of the expected result.
> __Utitlity/Helper Class__
> API.java
> 
> __Libraries__
> com.squareup.retrofit2:retrofit:2.2.0
> com.squareup.retrofit2:converter-gson:2.2.0
> com.squareup.okhttp3:okhttp-urlconnection:3.6.0
> com.squareup.okhttp3:logging-interceptor:3.6.0

4. __Base URL Helper__
Base Url Helper class to get the base url that is set.
> __Utitlity/Helper Class__
> BaseUrlHelper.java

5. __JSON Helper__
Utility class to do JSON related conversions.
> __Utitlity/Helper Class__
> GsonHelper.java
> 
> __Libraries__
> com.google.code.gson:gson:2.8.0

6. __End-Point Config__
Helper class that holds constants for API endpoints to be used.
> __Utitlity/Helper Class__
> EndPoint.java

7. __Pagination Helper__
Custom implementation of RecyclerView.OnScrollListener to handle "loadmore" (Pagination) in RecyclerView.
> __Utitlity/Helper Class__
> EndlessRecyclerOnScrollListener.java
> 
> __Libraries__
> com.android.support:recyclerview-v7:25.3.1

8. __Logger__
Utility class to be used as an alternative to Log in Android.
> __Utitlity/Helper Class__
> Logger.java

9. __Session Handler__
Utility class to handle access token related session.public void 

    setAccessToken(String iAccessToken)
    public String getAccessToken()
    public void clearSession()
> __Utitlity/Helper Class__
> AppSession.java 

10. __Screen Density Conversion Helper__
Utility class to do some minimal conversion related to android screen density.

    public static float dpToPx(Context iContext, float dp)
    public static float pxToDp(Context iContext, float px)
    public static int getScreenWidth()
    public static int getScreenHeight()
> __Utitlity/Helper Class__
> ConversionHelper.java

11. __Date Helper__
Utility class to do date conversions based on your requirement like parsing date string to display date in different date formats.
> __Utitlity/Helper Class__
> DateUtil.java

12. __HTML Helper__
Helper class to escape HTML strings.
> __Utitlity/Helper Class__
> HTMLEscape.java

13. __String Helper__
Utility class to that provides few string related operations.
> __Utitlity/Helper Class__
> StringUtils.java

14. __Network Connectivity Helper__
Helper class to check if the device is connected to internet (WiFi or Data connection).
> __Utitlity/Helper Class__
> NetworkUtils.java

15. __ID Generator__
Utility class to generate unique integer IDs.
> __Utitlity/Helper Class__
> NotificationId.java

16. __Dimension Config.__
Contains pre-defined margins and text sizes to be used within the app.
> __Utitlity/Helper Class__
> dimens.xml

17. __Widget Style Config.__
Contains basic styling for TextView and Edittext to be used withing the app.
> __Utitlity/Helper Class__
> widget_styles.xml

18. __Misc. Config.__
Utility class to configure Base Url for Production & Staging amongst other misc. configurations.
> __Utitlity/Helper Class__
> Config.java

19. __App Compat__
This library adds support for the Action Bar user interface design pattern. This library includes support for material design user interface implementations.
> __Libraries__
> com.android.support:appcompat-v7:25.3.1

20. __Card View__
This library adds support for the CardView widget, which lets you show information inside cards that have a consistent look on any app. These cards are useful for material design implementations, and are used extensively in layouts for TV apps.
> __Libraries__
> com.android.support:cardview-v7:25.3.1

21. __Recycler View__
The "recyclerview" library adds the RecyclerView class. This class provides support for the RecyclerView widget, a view for efficiently displaying large data sets by providing a limited window of data items.
> __Libraries__
> com.android.support:recyclerview-v7:25.3.1

22. __Facebook SDK__
Library that helps to integrate Facebook login.
> __Libraries__
> com.android.support:recyclerview-v7:25.3.1

23. __Google Auth. SDK__
Library that helps to integrate Google login.
> __Libraries__
> com.google.android.gms:play-services-auth:10.2.6

24. __Custom Font Config.__
Library to apply custom fonts to your app.
> __Libraries__
> uk.co.chrisjenx:calligraphy:2.2.0

25. __ORM Helper__
Object Relational Mapping Lite (ORM Lite) provides some simple, lightweight functionality for persisting Java objects to SQL databases while avoiding the complexity and overhead of more standard ORM packages.
> __Libraries__
> com.j256.ormlite:ormlite-android:5.0
> com.j256.ormlite:ormlite-core:5.0


---
 
Contact:
-------------
This module has been developed in house here at [WowLabz](http://wowlabz.com/) by Ritesh Dubey and Madhur Tewani from the Android team.

For feedback and suggestions on this project, you can reach out to:

 - ritesh.dubey@wowlabz.com
 - madhur.tewani@wowlabz.com

For all other communication, write to us at:

 - contact@wowlabz.com


----------
__Coming Soon:__

 - Swift Starter
 - iOS Starter
 - React Starter
