import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lab_4.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Set click listeners for buttons
        val btnEvents = null
        btnEvents.setOnClickListener {
            // Replace SecondActivity::class.java with the name of your target activity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btnFacilities.setOnClickListener {
            // Replace FacilitiesActivity::class.java with the name of your target activity
            val intent = Intent(this, FacilitiesActivity::class.java)
            startActivity(intent)
        }

        // Similarly, set click listeners for other buttons if needed
    }
}
