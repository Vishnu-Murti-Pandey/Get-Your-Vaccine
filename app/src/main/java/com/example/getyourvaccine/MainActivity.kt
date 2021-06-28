package com.example.getyourvaccine

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.getyourvaccine.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var postalCode: String = ""
    private var date: String = ""
    private var mYear: Int? = null
    private var mMonth: Int? = null
    private var mDay: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibCalender.setOnClickListener{

                // Get Current Date
                val c: Calendar = Calendar.getInstance()
                mYear = c.get(Calendar.YEAR)
                mMonth = c.get(Calendar.MONTH)
                mDay = c.get(Calendar.DAY_OF_MONTH)
                val datePickerDialog = DatePickerDialog(this,
                    { view, year, monthOfYear, dayOfMonth -> binding.etDate.setText(dayOfMonth.toString() + "-0" + (+monthOfYear + 1) + "-" + year)
                    },
                    mYear!!,
                    mMonth!!,
                    mDay!!
                )
                datePickerDialog.show()
        }

        binding.searchButton.setOnClickListener {

            postalCode = binding.etPostalAddress.text.toString()
            date = binding.etDate.text.toString()

            var isOk = true

            if (postalCode.length != 6) {
                Toast.makeText(this, "Invalid PostalCode", Toast.LENGTH_SHORT).show()
                isOk = false
            }
            if (date.length != 10) {
                Toast.makeText(this, "Invalid date", Toast.LENGTH_SHORT).show()
                isOk = false
            }
            if (isOk) {
                val intent = Intent(this, VaccineSlots::class.java)
                intent.putExtra("postal_code", postalCode)
                intent.putExtra("date", date)
                startActivity(intent)
            }
        }
    }

}