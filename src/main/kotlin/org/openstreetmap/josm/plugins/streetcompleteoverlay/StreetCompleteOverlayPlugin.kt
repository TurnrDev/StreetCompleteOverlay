package org.openstreetmap.josm.plugins.streetcompleteoverlay

import org.openstreetmap.josm.plugins.Plugin
import org.openstreetmap.josm.plugins.PluginInformation
import org.openstreetmap.josm.tools.Destroyable
import de.westnordost.streetcomplete.StreetCompleteApplication

class StreetCompleteOverlayPlugin(info: PluginInformation) : Plugin(info), Destroyable {
    var application: StreetCompleteApplication = StreetCompleteApplication()
}
