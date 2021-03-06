/**
 * <pre>
 *     author: blankj
 *     blog  : http://blankj.com
 *     time  : 2019/07/13
 *     desc  :
 * </pre>
 */
class Config {

    static applicationId = 'com.blankj.androidutilcode'
    static appName = 'Util'

    static compileSdkVersion = 29
    static minSdkVersion = 14
    static targetSdkVersion = 29
    static versionCode = 1_030_006
    static versionName = '1.30.6'// E.g. 1.9.72 => 1,009,072

    // lib version
    static gradlePluginVersion = '3.5.0'
    static kotlinVersion = '1.3.72'
    static supportVersion = '28.0.0'

    static depConfig = [
            /*Never delete this line*/
            /*Generated by "config.json"*/
            plugin_api_gradle_plugin   : new DepConfig(true , true , ":plugin:api-gradle-plugin"),
            plugin_bus_gradle_plugin   : new DepConfig(true , true , ":plugin:bus-gradle-plugin"),
            plugin_lib_base_transform  : new DepConfig(true , false, ":plugin:lib:base-transform", "com.blankj:base-transform:1.0"),
            feature_mock               : new DepConfig(false, true , ":feature:mock"),
            feature_launcher_app       : new DepConfig(true , true , ":feature:launcher:app"),
            feature_main_app           : new DepConfig(false, true , ":feature:main:app"),
            feature_main_pkg           : new DepConfig(true , true , ":feature:main:pkg"),
            feature_subutil_app        : new DepConfig(false, true , ":feature:subutil:app"),
            feature_subutil_pkg        : new DepConfig(true , true , ":feature:subutil:pkg"),
            feature_subutil_export     : new DepConfig(true , true , ":feature:subutil:export"),
            feature_utilcode_app       : new DepConfig(false, true , ":feature:utilcode:app"),
            feature_utilcode_pkg       : new DepConfig(true , true , ":feature:utilcode:pkg"),
            feature_utilcode_export    : new DepConfig(true , true , ":feature:utilcode:export", "com.blankj:utilcode-export:1.1"),
            lib_base                   : new DepConfig(true , true , ":lib:base"),
            lib_common                 : new DepConfig(true , true , ":lib:common"),
            lib_subutil                : new DepConfig(true , true , ":lib:subutil"),
            lib_utilcode               : new DepConfig(true , true , ":lib:utilcode", "com.blankj:utilcode:$versionName"),
            lib_utildebug              : new DepConfig(true , true , ":lib:utildebug"),
            lib_utildebug_no_op        : new DepConfig(true , true , ":lib:utildebug-no-op"),
            /*Never delete this line*/
            plugin_gradle              : new DepConfig(pluginPath: "com.android.tools.build:gradle:$gradlePluginVersion"),
            plugin_kotlin              : new DepConfig(pluginPath: "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"),
            plugin_maven               : new DepConfig(pluginPath: "com.github.dcendents:android-maven-gradle-plugin:2.1", pluginId: "com.github.dcendents.android-maven"),// ????????? maven
            plugin_bintray             : new DepConfig(pluginPath: "com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4", pluginId: "com.jfrog.bintray"),// ????????? bintray
            plugin_traute              : new DepConfig(pluginPath: "tech.harmonysoft:traute-gradle:1.1.10", pluginId: "tech.harmonysoft.oss.traute"),// ?????????????????????

            // ??????????????????????????? pluginPath ??????????????????????????? isApply = false
            // ?????? mavenLocal ??????????????????????????? isApply = true ?????????????????????????????????????????? bintrayUpload ???????????????
            plugin_api                 : new DepConfig(isApply: true, useLocal: false, pluginPath: "com.blankj:api-gradle-plugin:1.5", pluginId: "com.blankj.api"),
            //./gradlew clean :plugin_api-gradle-plugin:mavenLocal     // ??????????????? mavenLocal
            //./gradlew clean :plugin_api-gradle-plugin:bintrayUpload  // ????????? jcenter
            plugin_bus                 : new DepConfig(isApply: true, useLocal: false, pluginPath: "com.blankj:bus-gradle-plugin:2.6", pluginId: "com.blankj.bus"),
            //./gradlew clean :plugin_bus-gradle-plugin:mavenLocal     // ??????????????? mavenLocal
            //./gradlew clean :plugin_bus-gradle-plugin:bintrayUpload  // ????????? jcenter

            support_appcompat_v7       : new DepConfig("com.android.support:appcompat-v7:$supportVersion"),
            support_design             : new DepConfig("com.android.support:design:$supportVersion"),
            support_multidex           : new DepConfig("com.android.support:multidex:1.0.2"),
            support_constraint         : new DepConfig("com.android.support.constraint:constraint-layout:1.1.3"),

            kotlin                     : new DepConfig("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"),

            leakcanary                 : new DepConfig("com.squareup.leakcanary:leakcanary-android:2.1"),

            free_proguard              : new DepConfig("com.blankj:free-proguard:1.0.2"),
            swipe_panel                : new DepConfig("com.blankj:swipe-panel:1.2"),

            gson                       : new DepConfig("com.google.code.gson:gson:2.8.5"),
            glide                      : new DepConfig("com.github.bumptech.glide:glide:4.7.1"),
            retrofit                   : new DepConfig("com.squareup.retrofit2:retrofit:2.4.0"),
            commons_io                 : new DepConfig("commons-io:commons-io:2.6"),

            eventbus_lib               : new DepConfig("org.greenrobot:eventbus:3.1.1"),
            eventbus_processor         : new DepConfig("org.greenrobot:eventbus-annotation-processor:3.0.1"),

            photo_view                 : new DepConfig("com.github.chrisbanes:PhotoView:2.0.0"),

            test_junit                 : new DepConfig("junit:junit:4.12"),
            test_robolectric           : new DepConfig("org.robolectric:robolectric:4.3.1"),
    ]
}
//./gradlew clean :lib_utilcode:bintrayUpload