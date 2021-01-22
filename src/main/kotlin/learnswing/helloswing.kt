package learnswing
import java.awt.Color
import java.awt.Frame
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*
import java.lang.System

class Closewindow(var f:Frame):ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
        f.show(false)
        System.exit(0)
    }

}

class Changecolour(var f:Frame):ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
        println("ter-klik")

    }

}



fun main() {
    var frame:JFrame = JFrame()
    var b:JButton = JButton("click")
    var bclose:JButton = JButton("close")
    var closewindowaction = Closewindow(frame)
    var changecolouraction = Changecolour(frame)
    var changecolour:JButton = JButton("change colour")
    changecolour.setBounds(1240, 540,100, 40)
    bclose.setBounds(1100, 540, 100, 40)
    b.setBounds(960, 540, 100, 40)
    frame.setBounds(960,540,500,500)
    frame.add(b)
    frame.add(bclose)
    frame.add(changecolour)
    frame.layout=null
    //frame.setSize(400, 500)
    bclose.addActionListener(closewindowaction)
    changecolour.addActionListener(changecolouraction)
    frame.show(true)
}