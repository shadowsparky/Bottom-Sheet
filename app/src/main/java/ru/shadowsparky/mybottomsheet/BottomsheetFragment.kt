package ru.shadowsparky.mybottomsheet

import android.annotation.SuppressLint
import android.app.Dialog
import android.support.design.widget.BottomSheetDialogFragment
import android.view.View
import java.security.AccessController.getContext


class BottomsheetFragment : BottomSheetDialogFragment() {

    @SuppressLint("RestrictedApi")
    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)
        val contentView = View.inflate(context, R.layout.fragment_bottomsheet, null)
        dialog.setContentView(contentView)
    }
}