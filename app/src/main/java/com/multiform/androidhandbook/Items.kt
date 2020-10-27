package com.multiform.androidhandbook

import com.multiform.androidhandbook.models.ListArticleItem
import com.multiform.androidhandbook.models.MainListItem

object Items {

    // ANDROID LIST

    val uiList = mutableListOf(
        ListArticleItem("UI Layout", R.drawable.ic_app_components, true),
        ListArticleItem("LinearLayout", R.drawable.ic_app_components),
        ListArticleItem("ConstraintLayout", R.drawable.ic_app_components),
        ListArticleItem("RelativeLayout", R.drawable.ic_app_components),
        ListArticleItem("FrameLayout", R.drawable.ic_app_components),
        ListArticleItem("UI Components", R.drawable.ic_app_components, true),
        ListArticleItem("Input Fields", R.drawable.ic_app_components),
        ListArticleItem("Input methods", R.drawable.ic_app_components),
        ListArticleItem("Lists", R.drawable.ic_app_components),
        ListArticleItem("ListView", R.drawable.ic_app_components),
        ListArticleItem("GridView", R.drawable.ic_app_components),
        ListArticleItem("Clickable Components", R.drawable.ic_app_components),
        ListArticleItem("App Bar & Toolbar", R.drawable.ic_app_components),
        ListArticleItem("Multimedia Components", R.drawable.ic_app_components),
        ListArticleItem("ExoPlayer", R.drawable.ic_app_components),
        ListArticleItem("MediaPlayer", R.drawable.ic_app_components),
        ListArticleItem("Media Recorder", R.drawable.ic_app_components),
        ListArticleItem("Image Loaders", R.drawable.ic_app_components),
        ListArticleItem("Picasso", R.drawable.ic_app_components),
        ListArticleItem("Glide", R.drawable.ic_app_components),
        ListArticleItem("Data Views", R.drawable.ic_app_components),
        ListArticleItem("Adapter View", R.drawable.ic_app_components),
        ListArticleItem("Spinner", R.drawable.ic_app_components),
        ListArticleItem("Resources", R.drawable.ic_app_components, true),
        ListArticleItem("Strings", R.drawable.ic_app_components),
        ListArticleItem("Localizeable Strings", R.drawable.ic_app_components),
        ListArticleItem("Quantiti Strings", R.drawable.ic_app_components),
        ListArticleItem("String Array", R.drawable.ic_app_components),
        ListArticleItem("Spans", R.drawable.ic_app_components),
        ListArticleItem("Fonts", R.drawable.ic_app_components),
        ListArticleItem("XML Fonts", R.drawable.ic_app_components),
        ListArticleItem("Downloadable Fonts", R.drawable.ic_app_components),
        ListArticleItem("Styles", R.drawable.ic_app_components),
        ListArticleItem("Styleables", R.drawable.ic_app_components),
        ListArticleItem("Themes", R.drawable.ic_app_components),
        ListArticleItem("Drawables", R.drawable.ic_app_components),
        ListArticleItem("Adaptive Icons", R.drawable.ic_app_components),
        ListArticleItem("Vector Drawables", R.drawable.ic_app_components),
        ListArticleItem("Bitmap", R.drawable.ic_app_components),
        ListArticleItem("Mipmap", R.drawable.ic_app_components),
        ListArticleItem("More User Interface", R.drawable.ic_app_components, true),
        ListArticleItem("Progress Bar", R.drawable.ic_app_components),
        ListArticleItem("Search Interface", R.drawable.ic_app_components),
        ListArticleItem("Toast & Snackbar", R.drawable.ic_app_components),
        ListArticleItem("Dialogs & Pickers", R.drawable.ic_app_components),
        ListArticleItem("Animation", R.drawable.ic_app_components, true),
        ListArticleItem("Object Animator", R.drawable.ic_app_components),
        ListArticleItem("Transition", R.drawable.ic_app_components),
        ListArticleItem("Google Maps", R.drawable.ic_app_components, true),
        ListArticleItem("Accessibility", R.drawable.ic_app_components, true),
        ListArticleItem("Screen Readers", R.drawable.ic_app_components)
    )

    val appCompsList = mutableListOf(
        ListArticleItem("Activity", R.drawable.ic_android, true),
        ListArticleItem("Lifecycle", R.drawable.ic_android),
        ListArticleItem("Activity", R.drawable.ic_android),
        ListArticleItem("Fragments", R.drawable.ic_fragments, true),
        ListArticleItem("Fragment Manager", R.drawable.ic_fragments),
        ListArticleItem("Fragment Transaction", R.drawable.ic_fragments),
        ListArticleItem("Fragment Lifecycle", R.drawable.ic_fragments),
        ListArticleItem("Service", R.drawable.ic_service, true),
        ListArticleItem("Intent Service", R.drawable.ic_service),
        ListArticleItem("Intent", R.drawable.ic_intent, true),
        ListArticleItem("Intent Filters", R.drawable.ic_intent),
        ListArticleItem("Implicit Intents", R.drawable.ic_intent),
        ListArticleItem("Explicit Intents", R.drawable.ic_intent),
        ListArticleItem("Broadcast Receiver", R.drawable.ic_receiver, true)
    )

    val appManifesList = mutableListOf(
        ListArticleItem("Data Backup", R.drawable.ic_app_components),
        ListArticleItem("Permissions", R.drawable.ic_app_components),
        ListArticleItem("App Components", R.drawable.ic_app_components)
    )


    val notificationsList = mutableListOf(
        ListArticleItem("Notification", R.drawable.ic_app_components, true),
        ListArticleItem("Notifications Channels", R.drawable.ic_app_components)
    )

    val connectivityList = mutableListOf(
        ListArticleItem("Wi-Fi", R.drawable.ic_app_components),
        ListArticleItem("Telecom (SIM)", R.drawable.ic_app_components),
        ListArticleItem("Bluetooth", R.drawable.ic_app_components),
        ListArticleItem("NFC", R.drawable.ic_app_components),
        ListArticleItem("Download Manager", R.drawable.ic_app_components),
        ListArticleItem("Sync Adapter", R.drawable.ic_app_components),
        ListArticleItem("Connectivity Manager", R.drawable.ic_app_components)
    )

    val sensorsList = mutableListOf(
        ListArticleItem("Position", R.drawable.ic_app_components),
        ListArticleItem("Environment", R.drawable.ic_app_components),
        ListArticleItem("Motion", R.drawable.ic_app_components),
        ListArticleItem("Camera", R.drawable.ic_app_components)
    )

    val architectureList = mutableListOf(
        ListArticleItem("Code", R.drawable.ic_app_components, true),
        ListArticleItem("Clean Architecture", R.drawable.ic_app_components, true),
        ListArticleItem("Presentation", R.drawable.ic_app_components, true),
        ListArticleItem("MVVM", R.drawable.ic_app_components),
        ListArticleItem("MVP", R.drawable.ic_app_components),
        ListArticleItem("MVC", R.drawable.ic_app_components),
        ListArticleItem("VIPER", R.drawable.ic_app_components),
        ListArticleItem("Architecture Components", R.drawable.ic_app_components, true),
        ListArticleItem("Room (SQLite", R.drawable.ic_app_components),
        ListArticleItem("LiveData", R.drawable.ic_app_components),
        ListArticleItem("ViewModel", R.drawable.ic_app_components),
        ListArticleItem("Paging Library", R.drawable.ic_app_components),
        ListArticleItem("WorkManager (Thread Handling)", R.drawable.ic_app_components),
        ListArticleItem("Lifecycle", R.drawable.ic_app_components),
        ListArticleItem("Linters", R.drawable.ic_app_components, true),
        ListArticleItem("Detekt", R.drawable.ic_app_components),
        ListArticleItem("KtLint", R.drawable.ic_app_components),
        ListArticleItem("Android Lint", R.drawable.ic_app_components)
    )

    val threadHandlingList = mutableListOf(
        ListArticleItem("Handlers", R.drawable.ic_app_components),
        ListArticleItem("Coroutines", R.drawable.ic_app_components),
        ListArticleItem("Async Task", R.drawable.ic_app_components)
    )

    val networkHandlingList = mutableListOf(
        ListArticleItem("Retrofit", R.drawable.ic_app_components, true),
        ListArticleItem("Data Transfer Format", R.drawable.ic_app_components, true),
        ListArticleItem("REST", R.drawable.ic_app_components),
        ListArticleItem("GraphQL", R.drawable.ic_app_components),
        ListArticleItem("Protocol Buffer", R.drawable.ic_app_components),
        ListArticleItem("Flat Buffer", R.drawable.ic_app_components),
        ListArticleItem("Json Converter", R.drawable.ic_app_components, true),
        ListArticleItem("Gson", R.drawable.ic_app_components),
        ListArticleItem("Moshi", R.drawable.ic_app_components)
    )

    val dependencyInjectionList = mutableListOf(
        ListArticleItem("Koin", R.drawable.ic_app_components),
        ListArticleItem("Kodein", R.drawable.ic_app_components),
        ListArticleItem("Dagger", R.drawable.ic_app_components),
        ListArticleItem("Hilt", R.drawable.ic_app_components)
    )

    val testsList = mutableListOf(
        ListArticleItem("Unit Tests", R.drawable.ic_app_components, true),
        ListArticleItem("Integration Tests", R.drawable.ic_app_components, true),
        ListArticleItem("Instrumentation Tests", R.drawable.ic_app_components, true),
        ListArticleItem("Smoke Tests", R.drawable.ic_app_components, true),
        ListArticleItem("Test Libraries", R.drawable.ic_app_components, true),
        ListArticleItem("Espresso", R.drawable.ic_app_components),
        ListArticleItem("Robolectric", R.drawable.ic_app_components),
        ListArticleItem("UI Automator", R.drawable.ic_app_components),
        ListArticleItem("JUnit", R.drawable.ic_app_components)
    )

    val jetpackList = mutableListOf(
        ListArticleItem("Support Library", R.drawable.ic_app_components),
        ListArticleItem("Multidex", R.drawable.ic_app_components),
        ListArticleItem("Slices", R.drawable.ic_app_components),
        ListArticleItem("Material Design", R.drawable.ic_app_components),
        ListArticleItem("Emoji", R.drawable.ic_app_components),
        ListArticleItem("Navigation", R.drawable.ic_app_components),
        ListArticleItem("Data Binding", R.drawable.ic_app_components),
        ListArticleItem("Architecture Components", R.drawable.ic_app_components)
    )

    val buildConfigurationList = mutableListOf(
        ListArticleItem("Gradle", R.drawable.ic_app_components),
        ListArticleItem("Groovy", R.drawable.ic_app_components),
        ListArticleItem("Build Types", R.drawable.ic_app_components),
        ListArticleItem("Build Flavors", R.drawable.ic_app_components)
    )

    val appPublishingList = mutableListOf(
        ListArticleItem("Google Play Services", R.drawable.ic_app_components, true),
        ListArticleItem("App APK", R.drawable.ic_app_components, true),
        ListArticleItem("App Bundle", R.drawable.ic_app_components, true),
        ListArticleItem("Play Store", R.drawable.ic_app_components, true),
        ListArticleItem("App Billing", R.drawable.ic_app_components),
        ListArticleItem("App Links", R.drawable.ic_app_components),
        ListArticleItem("App Actions", R.drawable.ic_app_components),
        ListArticleItem("Instant Apps", R.drawable.ic_app_components)
    )

    val andrList = mutableListOf(
        MainListItem("App Components", R.drawable.ic_app_components, appCompsList),
        MainListItem("App Manifest", R.drawable.ic_app_manifest, appManifesList),
        MainListItem("UI", R.drawable.ic_ui, uiList),
        MainListItem("Notifications", R.drawable.ic_app_components, notificationsList),
        MainListItem("Connectivity", R.drawable.ic_app_components, connectivityList),
        MainListItem("Sensors", R.drawable.ic_app_components, sensorsList),
        MainListItem("Architecture", R.drawable.ic_app_components, architectureList),
        MainListItem("Thread Handling", R.drawable.ic_app_components, threadHandlingList),
        MainListItem("Network Handling", R.drawable.ic_app_components, networkHandlingList),
        MainListItem("Dependency Injection", R.drawable.ic_app_components, dependencyInjectionList),
        MainListItem("Tests", R.drawable.ic_app_components, testsList),
        MainListItem("Android Jetpack", R.drawable.ic_app_components, jetpackList),
        MainListItem("Build Configuration", R.drawable.ic_app_components, buildConfigurationList),
        MainListItem("App Publishing", R.drawable.ic_app_components, appPublishingList)
    )
}