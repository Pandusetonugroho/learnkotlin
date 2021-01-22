package learnswing

import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.Frame
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import java.lang.System
import javax.swing.JTextField

class Myframe:JFrame {
    var btnclose = JButton("close")
    var no1 = JButton("1")
    var no2 = JButton("2")
    var no3 = JButton("3")
    var tf = JTextField()

    class Closewindow(var f:Myframe):ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            f.show(false)
        }
    }

    class n1(var f:Myframe):ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            f.tf.text=f.tf.text+"1"
        }
    }

    class n2(var f:Myframe):ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            f.tf.text=f.tf.text+"2"
        }
    }

    class n3(var f:Myframe):ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            f.tf.text=f.tf.text+"3"
        }
    }

    constructor(title:String, width:Int, height:Int):super() {

        var closewindowaction = Closewindow(this)
        var no1action = n1(this)
        var no2action = n2(this)
        var no3action = n3(this)

        this.title=title
        this.layout=FlowLayout(FlowLayout.LEFT)
        this.setSize(width, height)
        this.btnclose.setSize(100,100)
        this.no1.setSize(100,100)
        this.no2.setSize(100,100)
        this.no3.setSize(100,100)
        this.tf.preferredSize=Dimension(150, 150)
        this.add(btnclose)
        this.add(no1)
        this.add(no2)
        this.add(no3)
        this.add(tf)
        this.btnclose.addActionListener(closewindowaction)
        this.no1.addActionListener(no1action)
        this.no2.addActionListener(no2action)
        this.no3.addActionListener(no3action)
    }


}

class Mainframe:JFrame {
    var b1 = JButton("1")
    var b2 = JButton("2")

    class Newframe1(var f:Frame):ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            var tes = Myframe("frame 1",  500, 500)
            tes.setLocation(200,200)
            tes.show(true)
        }
    }

    class Newframe2(var f:Frame):ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            var tes = Myframe("frame 2", 500, 500)
            tes.setLocation(1000,200)
            tes.show(true)
        }
    }

    constructor(width: Int, height: Int) {

        var newframe1action = Newframe1(this)
        var newframe2action = Newframe2(this)

        this.title="main frame"
        this.setSize(width, height)
        this.b1.setSize(100, 100)
        this.b2.setSize(100, 100)
        this.b1.addActionListener(newframe1action)
        this.b2.addActionListener(newframe2action)
        this.add(b1)
        this.add(b2)
        this.layout=FlowLayout()
    }
}

fun main() {
    var tes = Mainframe(500,500)
    tes.show(true)
}