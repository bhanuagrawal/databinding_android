package bhanu.agrawal.databinding


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bhanu.agrawal.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main)*/
        setContentView(R.layout.activity_main)
    }
}
