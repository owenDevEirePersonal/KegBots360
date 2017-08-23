package com.deveire.dev.kegbots360.bleNfc;

import android.bluetooth.BluetoothDevice;

/**
 * Created by lochy on 16/1/19.
 */
public abstract class ScannerCallback {
    public void onReceiveScanDevice(final BluetoothDevice device, final int rssi, final byte[] scanRecord) {
    }

    public void onScanDeviceStopped() {
    }
}
