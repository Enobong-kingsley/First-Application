 package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.BigInteger
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttn = findViewById<Button>(R.id.button)


        buttn.setOnClickListener OnClickListener@{
            val mysalary = salary_text.text.toString().toInt()
            val salary1: Int = mysalary
            val myallowance = allowance_text.text.toString().toInt()
            val allowance1: Int = myallowance
            val addtotal = salary1 + allowance1
            val myrate = addtotal * 10 / 100
            income_text.text = "Result : $myrate"
            val myamount = mysalary - myrate
            amount.setText("Balance : $myamount" )

            if (TextUtils.isEmpty(salary_text.text.toString()))
                salary_text.setError("Enter Salary")
            return@OnClickListener
            }
        if (TextUtils.isEmpty(allowance_text.text.toString()))
            allowance_text.setError("Enter Allowance")
        return
        }


    }













                // this try and catch code will help the app not to crash when the user is using it
                // it trys the code and then prints it out in your android studio logcat
//                try {
//                    if (mysalary < 0) {
//                        salary_text.error = "Salary required"
//                        return@setOnClickListener
//                    }
//
//                    if (allowance < 0 && allowance < 8) {
//                        allowance_text.error = "Allowance required"
//                        return@setOnClickListener
//                    } else {
//                        allowance_text.error = null
//                    }
//
//                }catch (e: Throwable){
//                    Log.d(TAG, "This is the log ${e.message}")
//                    print(e.message)
//                }
//            // this is more like a user authentication code
                // this is another way or method of creating it aside from the above code

//            if (TextUtils.isEmpty(salary_text.text.toString())){
////                salary_text.setError("Enter Salary..")
//                salary_text.error = "Enter salary"
//                return@OnClickListener
//            }
//            if ((TextUtils.isEmpty(allowance_text.text.toString()))){
//                allowance_text.setError("Enter Allowance..")
//                return@OnClickListener
//            }

//
//            }
//
//        }
//// Here, all your constants are stored e.g MAinActivity
//    companion object {
//        private const val TAG = "MainActivity"
//    }
//}
// this is the console app
// i.e it is written in your jetbrains before tested in your android studio

//val read = Scanner(System.`in`)
//println(" Enter ur salary : ")
//val num1 = read.nextInt()
//println(" Enter ur allowance : ")
//val num2 = read.nextInt()
//val num3 = num1 + num2
//println("your salary and allowance is $num3")
//val num4 = num3 * 10 / 100
//println("Your tax rate is $num4")
//val num5 = num1 - num4
//println("tour total amount is $num5")

// Apart from making a console app ... you can also write down sudo codes
// these are codes written probably in a worksheet that contains the how,why,when,etc or the way your app will run

// the .trim helps to trim the user massage. for instance if there is a wider space, it trims the space to fit perfectly
//        val salary   = mysalary.editableText.toString().trim();
//        val allowance  = myallowance.editableText.toString().trim()
