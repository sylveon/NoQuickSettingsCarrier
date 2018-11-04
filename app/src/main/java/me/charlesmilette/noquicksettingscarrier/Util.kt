package me.charlesmilette.noquicksettingscarrier

import android.content.res.XResources
import android.view.View
import de.robv.android.xposed.callbacks.XC_LayoutInflated
import de.robv.android.xposed.callbacks.XC_LayoutInflated.Unhook

fun <T : View> XC_LayoutInflated.LayoutInflatedParam.findViewById(id: String): T? = view.findViewById(res.getIdentifier(id, "id", res.packageName))

fun XResources.hookLayout(pkg: String, type: String, name: String, callback: (XC_LayoutInflated.LayoutInflatedParam) -> Unit): Unhook = hookLayout(pkg, type, name, object : XC_LayoutInflated() {
    override fun handleLayoutInflated(liparam: LayoutInflatedParam) {
        callback(liparam)
    }
})