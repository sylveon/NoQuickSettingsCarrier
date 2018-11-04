package me.charlesmilette.noquicksettingscarrier

import android.view.View
import android.widget.TextView
import de.robv.android.xposed.IXposedHookInitPackageResources
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam

class Main : IXposedHookInitPackageResources {
    override fun handleInitPackageResources(resparam: InitPackageResourcesParam) {
        if (resparam.packageName == "com.android.systemui") {
            resparam.res.hookLayout("com.android.systemui", "layout", "quick_status_bar_header_system_icons") { liparam ->
                val carrierLabel = liparam.findViewById<TextView>("qs_carrier_text")

                carrierLabel?.visibility = View.INVISIBLE
            }
        }
    }
}
