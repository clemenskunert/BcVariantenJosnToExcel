package com.renner.actionnumbersave.framework.data.input

enum class Unit(id: Int, code: String, description: String) {
    CBM(1, "CBM", "Kubikmeter"),
    G(2, "G", "Gramm"),
    KG(3, "KG", "Kilogramm"),
    L(4, "L", "Liter"),
    LFM(5, "LFM", "Laufmeter"),
    QDM(6, "QDM", "Kubikdezimeter"),
    QM(7, "QM","Quadratmeter"),
    STK(8, "STK", "Stück"),
    VE(9, "VE", "Verpackungseinheit")
}