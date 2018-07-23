package cubex.mahesh.spftest

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.register.*
import kotlinx.android.synthetic.main.register.view.*

class RegisterFragment:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater,
             container: ViewGroup?, savedInstanceState: Bundle?): View? {

    var v = inflater.inflate(R.layout.register,container,
            false)

        v.register.setOnClickListener({
        var spf = activity!!.getSharedPreferences("myprfs",
                Context.MODE_PRIVATE)
         var spe = spf.edit()
            spe.putString("uname",et1.text.toString())
            spe.putString("pass",et2.text.toString())
            spe.putString("email",et3.text.toString())
            spe.putString("mno",et4.text.toString())
            spe.commit()

            var fManager = activity!!.supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,LoginFragment())
            tx.commit()
        })
        
        return v
    }
}