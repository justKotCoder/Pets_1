package com.example.pets.logic.asynkClass.FunSendMess

import com.example.pets.logic.asynkClass.AsynkClasses.SendMailTask


fun sendNessage(mail: String): Int {
    val codeOfFive= java.util.Random()
    val numbers= codeOfFive.nextInt(99999)
    val sendMailTask =
        SendMailTask(
            mail,
            "Code",
            "Code verification",
            numbers.toString()
        )
    sendMailTask.execute()
    return numbers
}