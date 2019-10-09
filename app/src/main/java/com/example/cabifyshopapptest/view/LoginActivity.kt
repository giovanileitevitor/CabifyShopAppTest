package com.example.cabifyshopapptest.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    private lateinit var context: Context
    private var PRIVATE_MODE = 0
    private val PREF_NAME = "credenciaisAcesso"
    private var checkboxFlag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.cabifyshopapptest.R.layout.activity_login)

        initVars()

        initActions()

    }

    private fun initVars(){
        context = this@LoginActivity

        edt_userName.requestFocus()

//        if(checkboxFlag){
//            try {
//                edt_userName.text = lerCredencial("username").toString()
//                edt_userName.text = lerCredencial("password").toString()
//            }
//            catch(exception){
//                edt_userName.setText(" ")
//                edt_passWord.setText(" ")
//            }
//        }

    }

    private fun initActions(){

        btn_prosseguir.setOnClickListener {

            if(LoginValido()){
                var intent = Intent(context, MainActivity::class.java)
                startActivity(intent)
                //finish()
                if(checkboxFlag){
                    gravarCredenciais(edt_userName?.text.toString().trim(),
                                        edt_passWord?.text.toString().trim())
                }
                else{

                }
            }
            else{
                Toast.makeText(context, "Credenciais inválidas",Toast.LENGTH_SHORT).show()
            }
        }

        chbox_salvar.setOnClickListener {

            checkboxFlag = chbox_salvar.isChecked

        }


    }

    private fun LoginValido(): Boolean {
        var status: Boolean = true
        var username: String = edt_userName?.text.toString().trim()
        var password: String = edt_passWord?.text.toString().trim()

        status = !(username.isEmpty() || password.isEmpty() || username.isBlank() || password.isBlank())

        return status
    }

    private fun gravarCredenciais(username : String, password : String){
        val sharedPref = this.getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putString("USERNAME", username)
            putString("PASSWORD", password)
            commit()
        }



    }

    private fun lerCredencial(credencial : String) : String {
        var valorCredencial : String = ""


        return valorCredencial
    }

}
