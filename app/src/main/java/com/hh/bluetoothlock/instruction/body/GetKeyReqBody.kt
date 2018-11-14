package com.hh.bluetoothlock.instruction.body

/**
 * Create By hHui on 2018/11/13
 *
 * @param key 通信秘钥 默认为 "yOTmK50z"
 */
class GetKeyReqBody(private val key: String) : Body() {

    override fun toByteArray(): ByteArray {
        return key.toByteArray()
    }

    override fun getLength(): Int {
        return key.length
    }
}