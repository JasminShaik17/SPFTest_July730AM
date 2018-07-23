package cubex.mahesh.spftest

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.welcome.*
import kotlinx.android.synthetic.main.welcome.view.*

class WelcomeFragment:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater,
             container: ViewGroup?, savedInstanceState: Bundle?): View? {

    var v = inflater.inflate(R.layout.welcome,container,
            false)
        var spf = activity!!.getSharedPreferences("myprfs",
                Context.MODE_PRIVATE)
        var uname = spf.getString("uname","no value")
        v.tview.text = "Welcome To NareshIT : $uname"
        
        return v
    }
}