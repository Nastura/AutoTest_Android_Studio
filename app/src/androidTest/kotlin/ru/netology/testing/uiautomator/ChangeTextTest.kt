package ru.netology.testing.uiautomator

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import androidx.test.uiautomator.Until
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


const val SETTINGS_PACKAGE = "com.android.settings" // - константа для открытия настроек
const val MODEL_PACKAGE = "ru.netology.testing.uiautomator"

const val TIMEOUT = 5000L

@RunWith(AndroidJUnit4::class)
class ChangeTextTest {

    private lateinit var device: UiDevice
    private val textToSet = "Netology"
    private val MytextToSet = " "


//    @Test
//    fun testInternetSettings() {
//        // Press home
//        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
//        device.pressHome()
      // Обращаемся к объекту UI девайс  и вызываем метод Пресс Хоум .
      // нажатие кнопки которая при нажатии андройд сворачивает текущие окна, на домашнюю страницу.
      // Домой. стартовый
      //device.wait - ожидание ждем пока появится лаунчер
//        // Wait for launcher
//        val launcherPackage = device.launcherPackageName
//        device.wait(Until.hasObject(By.pkg(launcherPackage)), TIMEOUT)
//        waitForPackage(SETTINGS_PACKAGE)
//        val context = ApplicationProvider.getApplicationContext<Context>()
//        val intent = context.packageManager.getLaunchIntentForPackage(SETTINGS_PACKAGE) // в переменную интент записали заявку на открытие приложения с настройками
//        context.startActivity(intent)
//        device.wait(Until.hasObject(By.pkg(SETTINGS_PACKAGE)), TIMEOUT)
//        device.findObject(
//            UiSelector().resourceId("android:id/title").instance(0)
//        ).click()
//    }

//    @Test
//    fun testChangeText() {
//        // Press home
//        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
//        device.pressHome()
//        // Wait for launcher
//        val launcherPackage = device.launcherPackageName
//        device.wait(Until.hasObject(By.pkg(launcherPackage)), TIMEOUT)
//        waitForPackage(SETTINGS_PACKAGE)
//        val context = ApplicationProvider.getApplicationContext<Context>()
//        val packageName = context.packageName
//        val intent = context.packageManager.getLaunchIntentForPackage(packageName)
//        context.startActivity(intent)
//        device.wait(Until.hasObject(By.pkg(packageName)), TIMEOUT)
//        device.findObject(By.res(packageName, "userInput")).text = textToSet
//        device.findObject(By.res(packageName, "buttonChange")).click()
//
//        val result = device.findObject(By.res(packageName, "textToBeChanged")).text
//        assertEquals(result, textToSet)
//    }

    private fun waitForPackage(packageName: String) {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val intent = context.packageManager.getLaunchIntentForPackage(packageName)
        context.startActivity(intent)
        device.wait(Until.hasObject(By.pkg(packageName)), TIMEOUT)
    }

    @Before
    fun beforeEachTest() {
        // Press home
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.pressHome()
        // Wait for launcher
        val launcherPackage = device.launcherPackageName
        device.wait(Until.hasObject(By.pkg(launcherPackage)), TIMEOUT)
    }

//    @Test
//    fun testInternetSettings() {
//        waitForPackage(SETTINGS_PACKAGE)
//
//        device.findObject(
//            UiSelector().resourceId("android:id/title").instance(0)
//        ).click()
//    }

//    @Test
//    fun testChangeText() {
//        val packageName = MODEL_PACKAGE
//        waitForPackage(packageName)
//
//        device.findObject(By.res(packageName, "userInput")).text = textToSet
//        device.findObject(By.res(packageName, "buttonChange")).click()
//
//        val result = device.findObject(By.res(packageName, "textToBeChanged")).text
//        assertEquals(result, textToSet)
//    }


//    @Test
//    fun testInternetSettings() {
//        // Press home
//        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
//        device.pressHome() //  >>>>// Обращаемся к объекту UI девайс  и вызываем метод Пресс Хоум .
//     // нажатие кнопки которая при нажатии андройд сворачивает текущие окна, на домашнюю страницу.
//     // Домой. стартовый
//        // device.wait - ожидание ждем пока появится лаунчер
//        // Wait for launcher
//        val launcherPackage = device.launcherPackageName
//        device.wait(Until.hasObject(By.pkg(launcherPackage)), TIMEOUT)
//
//        val context = ApplicationProvider.getApplicationContext<Context>()
//        val intent = context.packageManager.getLaunchIntentForPackage(MODEL_PACKAGE)
//        context.startActivity(intent)
//        device.wait(Until.hasObject(By.pkg(MODEL_PACKAGE)), TIMEOUT)
//
//        device.findObject(By.res(MODEL_PACKAGE, "userInput")).text = textToSet
//        device.findObject(By.res(MODEL_PACKAGE,"buttonChange")).click()
//        val result = device.findObject(By.res(MODEL_PACKAGE, "textToBeChanges")).text
//        assertEquals(textToSet, result)
//    }


    // HOMEWORK

//    Задание «UI Automator»
//    На лекции был реализован один тест на модельное приложение.
//    Ваша задача — добавить ещё два теста:
//    тест на попытку установки пустой строки;
//    тест на открытие текста в новой Activity.
//    Первый тест должен устанавливать в поле ввода пустой текст и осуществлять нажатие на кнопку изменения текста.
//    После нужно проверить, что текст в TextView остался прежним.
//    Обратите внимание, что пустым также является текст, состоящий только из пробельных символов.
//    Второй тест должен устанавливать в поле ввода непустой текст и осуществлять нажатие на кнопку запуска новой Activity.
//    Затем он должен дождаться появления Activity на экране и в качестве
//    результата сравнить содержимое TextView с текстом, который был установлен в поле ввода.
//    Для определения ID у TextView, принадлежащего второй Activity, рекомендуем использовать инструмент UI Automator Viewer


// >>>>>>>>>>>>>>>>   МОИ ТЕСТЫ
@Test
    fun myTestNullStringTitle1Test() {
        // Press home
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.pressHome()

        val launcherPackage = device.launcherPackageName
        device.wait(Until.hasObject(By.pkg(launcherPackage)), TIMEOUT)

        val context = ApplicationProvider.getApplicationContext<Context>()
//        val packageName = context.packageName
        val intent = context.packageManager.getLaunchIntentForPackage(MODEL_PACKAGE)
        context.startActivity(intent)

        device.wait(Until.hasObject(By.pkg(MODEL_PACKAGE)), TIMEOUT)
        device.findObject(By.res(MODEL_PACKAGE, "userInput")).text = MytextToSet
        device.findObject(By.res(MODEL_PACKAGE, "buttonActivity")).click()
        Thread.sleep(5000)
        val result = device.findObject(By.res(MODEL_PACKAGE, "text")).text
        assertEquals(result, MytextToSet)
    }


    @Test
    fun myTestnewActiviti2Test() {

    }

}



