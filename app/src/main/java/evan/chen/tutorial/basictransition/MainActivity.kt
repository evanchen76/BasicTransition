package evan.chen.tutorial.basictransition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.*
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scene1 = Scene.getSceneForLayout(scene_root, R.layout.scene1, this)
        val scene2 = Scene.getSceneForLayout(scene_root, R.layout.scene2, this)
        val scene3 = Scene.getSceneForLayout(scene_root, R.layout.scene3, this)

        scene1Button.setOnClickListener {
            // 到Scene1
            TransitionManager.go(scene1)
        }

        scene2Button.setOnClickListener {
            // 到Scene2
            TransitionManager.go(scene2)
        }

        scene3Button.setOnClickListener {
            // 到Scene3
            TransitionManager.go(scene3)
        }
    }
}

