package com.example.dialogbox

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.btn1.setOnClickListener {
    val builder1 = AlertDialog.Builder(this,)
    builder1.setTitle("Are You Sure")
    builder1.setMessage("Do You Want to close the App")
    builder1.setIcon(R.drawable.appicon)
    builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog: DialogInterface?, which: Int ->
        //What Action Should be Performed when you Yes is clicked ?
    })
    builder1.setNegativeButton("No", DialogInterface.OnClickListener{dialog: DialogInterface?, which: Int ->
        // What Action Should be Performed when No is clicked?
    })
    builder1.show()
}


        binding.btn2.setOnClickListener {
            val Options = arrayOf("GloadJamun", "RashMali", "KajuKatli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your Fevourite Sweet")
            builder2.setSingleChoiceItems(Options, 0, DialogInterface.OnClickListener{dialog, which ->
                //What Action Should be Perform When User clicks on Any Option.
                Toast.makeText(this, "You Clicked on ${Options[which]}", Toast.LENGTH_SHORT).show()
            })
          builder2.setPositiveButton("Accept", DialogInterface.OnClickListener { dialog: DialogInterface?, which: Int ->
                //What Action Should be Performed when you is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener{dialog: DialogInterface?, which: Int ->
                // What Action Should be Performed when yes is clicked ?
            })
            builder2.show()
        }


        binding.btn3.setOnClickListener {
            val option = arrayOf("GloadJamun", "RashMali", "KajuKatli")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which is your Fevourite Sweet")

            builder3.setSingleChoiceItems(option, 0, DialogInterface.OnClickListener{dialog, which ->
                //What Action Should be Perform When User clicks on Any Option.
                Toast.makeText(this, "You Clicked on ${option[which]}", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Accept", DialogInterface.OnClickListener { dialog: DialogInterface?, which: Int ->
                //What Action Should be Performed when you is clicked ?
            })
            builder3.setNegativeButton("Decline", DialogInterface.OnClickListener{dialog: DialogInterface?, which: Int ->
                // What Action Should be Performed when yes is clicked ?
            })
            builder3.show()
        }
    }
}
