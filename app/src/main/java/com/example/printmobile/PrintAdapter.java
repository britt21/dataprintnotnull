package com.example.printmobile;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;

class MyPrintDocumentAdapter extends PrintDocumentAdapter {

    private Context mContext;

    public MyPrintDocumentAdapter(Context context) {
        mContext = context;
    }

    @Override
    public void onLayout(PrintAttributes oldAttributes, PrintAttributes newAttributes,
                         CancellationSignal cancellationSignal, LayoutResultCallback callback, Bundle extras) {
        // Nothing to do here
    }

    @Override
    public void onWrite(PageRange[] pages, ParcelFileDescriptor destination,
                        CancellationSignal cancellationSignal, WriteResultCallback callback) {
        // Generate the content to be printed here
        // Use the destination file descriptor to write the content to a PDF file
    }
}