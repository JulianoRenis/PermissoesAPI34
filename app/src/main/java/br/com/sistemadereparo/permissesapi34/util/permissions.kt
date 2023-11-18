package br.com.sistemadereparo.permissesapi34.util

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder

fun appSettingOpen(context: Context){
    Toast.makeText(
        context,
        "Vá para Configuração e habilite todas as permissões",
        Toast.LENGTH_LONG
    ).show()

    val settingIntent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
    settingIntent.data = Uri.parse("package:${context.packageName}")
    context.startActivity(settingIntent)
}

fun warningPermissionDialog(context: Context, listener : DialogInterface.OnClickListener){
    MaterialAlertDialogBuilder(context)
        .setMessage("Todas as permissões são necessárias para este aplicativo")
        .setCancelable(false)
        .setPositiveButton("Ok",listener)
        .create()
        .show()
}