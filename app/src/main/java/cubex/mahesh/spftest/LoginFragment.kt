package cubex.mahesh.spftest

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.loginfrag.view.*

class LoginFragment:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater,
             container: ViewGroup?, savedInstanceState: Bundle?): View? {

    var v = inflater.inflate(R.layout.loginfrag,container,
            false)

        v.register.setOnClickListener({
            var fManager = activity!!.supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,RegisterFragment())
            tx.commit()
        })

        v.login.setOnClickListener({
            var spf = activity!!.getSharedPreferences("myprfs",
                    Context.MODE_PRIVATE)
            var uname = spf.getString("uname","no value")
            var pass = spf.getString("pass","no value")
            if(uname.equals(v.et1.text.toString()) &&
                    pass.equals(v.et2.text.toString())){
                var fManager = activity!!.supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,WelcomeFragment())
                tx.commit()
            }else{
                Toast.makeText(activity,"Invalid User",
                        Toast.LENGTH_LONG).show()
            }
        })


        return v
    }
}