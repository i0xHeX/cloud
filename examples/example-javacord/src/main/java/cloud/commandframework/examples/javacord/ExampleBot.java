//
// MIT License
//
// Copyright (c) 2020 Alexander Söderberg & Contributors
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
//
package cloud.commandframework.examples.javacord;

import dev.simplix.core.common.aop.ScanComponents;
import dev.simplix.core.common.aop.SimplixApplication;
import dev.simplix.core.common.inject.SimplixInstaller;
import dev.simplix.core.common.platform.Platform;
import org.checkerframework.checker.nullness.qual.NonNull;

import static cloud.commandframework.examples.javacord.ExampleBot.APPLICATION_NAME;

@SimplixApplication(
        name = APPLICATION_NAME,
        version = "1.0.0",
        authors = "JarFiles"
)
@ScanComponents("cloud.commandframework.examples.javacord")
public final class ExampleBot {

    public static final String APPLICATION_NAME = "ExampleBot";

    private ExampleBot() {
        throw new UnsupportedOperationException();
    }

    /**
     * Starts the bot
     *
     * @param args Arguments to start the bot with (NOT used)
     */
    public static void main(@NonNull final String[] args) {
        SimplixInstaller
                .instance()
                .register(ExampleBot.class);

        SimplixInstaller.instance().install(Platform.STANDALONE);
    }

}
