import groovy.swing.SwingBuilder
import java.awt.*
class ThemeDialog{
        String appName
                String directoryName
                void show() {
                        def sBuilder = new SwingBuilder()
                                sBuilder.edt {
                                        // Dialog settings
                                        dialog(modal: true, // ダイアログがdispose()されるまで処理を止める
                                                        title: 'Enter Theme setting', // Dialogのタイトル
                                                        alwaysOnTop: true, //　最前面に表示
                                                        resizable: false, // リサイズ不可
                                                        pack: true, // 全要素を含めて表示
                                                        show: true // すぐに表示する
                                              ) {
                                                // 縦に並ぶレイアウト
                                                vbox {
                                                        // テーマ名ラベル(Android TextViewのようなもの)
                                                        label(text: "Please enter theme name:")

                                                                // 文字入力フィールド
                                                                def nameInput = textField(text: "App Name テスト")

                                                                // フォルダ名
                                                                label(text: "Please enter folder name:")
                                                                // 文字入力フィールド
                                                                def directoryNameInput = textField(text: "test")

                                                                // OKボタン
                                                                button(defaultButton: true, text: 'OK', actionPerformed: {
                                                                                // ボタンが押された時のイベントハンドラ
                                                                                appName = nameInput.text
                                                                                directoryName = directoryNameInput.text
                                                                                dispose()
                                                                                })
                                                }
                                        }
                                }
                }
}
