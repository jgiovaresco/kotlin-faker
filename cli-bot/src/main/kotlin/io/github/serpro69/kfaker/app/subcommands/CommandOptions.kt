package io.github.serpro69.kfaker.app.subcommands

import picocli.CommandLine

@CommandLine.Command(
    synopsisHeading = "%nUsage:%n",
    descriptionHeading = "%nDescription:%n",
    parameterListHeading = "%nParameters:%n",
    optionListHeading = "%nOptions:%n",
    commandListHeading = "%nCommands:%n"
)
class CommandOptions {

    @CommandLine.Option(
        names = ["-l", "--locale"],
        description = ["dictionary to use when generating data", "default: 'en'"],
        required = false
    )
    var locale: String = "en"

    @CommandLine.Option(
        names = ["-v", "--verbose"],
        description = ["adds a sample value to the output"],
        required = false
    )
    var verbose: Boolean = false
}
