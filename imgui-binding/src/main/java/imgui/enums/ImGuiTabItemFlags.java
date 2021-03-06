package imgui.enums;

/**
 * Flags for ImGui::BeginTabItem()
 */
public final class ImGuiTabItemFlags {
    private ImGuiTabItemFlags() {
    }

    public static final int None = 0;
    public static final int UnsavedDocument = 1;                   // Append '*' to title without affecting the ID, as a convenience to avoid using the ### operator. Also: tab is selected on closure and closure is deferred by one frame to allow code to undo it without flicker.
    public static final int SetSelected = 1 << 1;                  // Trigger flag to programmatically make the tab selected when calling BeginTabItem()
    public static final int NoCloseWithMiddleMouseButton = 1 << 2; // Disable behavior of closing tabs (that are submitted with p_open != NULL) with middle mouse button. You can still repro this behavior on user's side with if (IsItemHovered() && IsMouseClicked(2)) *p_open = false.
    public static final int NoPushId = 1 << 3;                     // Don't call PushID(tab->ID)/PopID() on BeginTabItem()/EndTabItem()
}
