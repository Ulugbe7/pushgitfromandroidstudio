package uz.gita.pushgitfromas

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createLog(msg: String, tag: String) {
        // help for you
        Log.d(tag, msg)
    }

    fun createToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun createDialog(msg: String) {
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle(msg).create().show()
    }
}