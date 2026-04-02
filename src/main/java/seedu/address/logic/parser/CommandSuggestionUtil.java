package seedu.address.logic.parser;

import java.util.List;
import java.util.Optional;

import seedu.address.logic.commands.AddCommand;
import seedu.address.logic.commands.CircleAddCommand;
import seedu.address.logic.commands.CircleFilterCommand;
import seedu.address.logic.commands.CircleRemoveCommand;
import seedu.address.logic.commands.ClearCommand;
import seedu.address.logic.commands.DeleteCommand;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.ExitCommand;
import seedu.address.logic.commands.FindCommand;
import seedu.address.logic.commands.HelpCommand;
import seedu.address.logic.commands.ListCommand;
import seedu.address.logic.commands.NoteAddCommand;
import seedu.address.logic.commands.NoteClearCommand;
import seedu.address.logic.commands.RemindCommand;
import seedu.address.logic.commands.SetFollowUpCommand;
import seedu.address.logic.commands.TagAddCommand;
import seedu.address.logic.commands.TagRemoveCommand;
import seedu.address.logic.commands.ViewCommand;

/**
 * Provides utility methods to suggest a command word for unrecognised input.
 */
public class CommandSuggestionUtil {

    /**
     * Contains all command words available for suggestion matching.
     */
    private static final List<String> KNOWN_COMMANDS = List.of(
        AddCommand.COMMAND_WORD,
        ClearCommand.COMMAND_WORD,
        DeleteCommand.COMMAND_WORD,
        EditCommand.COMMAND_WORD,
        ExitCommand.COMMAND_WORD,
        FindCommand.COMMAND_WORD,
        SetFollowUpCommand.COMMAND_WORD,
        RemindCommand.COMMAND_WORD,
        HelpCommand.COMMAND_WORD,
        ListCommand.COMMAND_WORD,
        NoteAddCommand.COMMAND_WORD,
        NoteClearCommand.COMMAND_WORD,
        TagAddCommand.COMMAND_WORD,
        TagRemoveCommand.COMMAND_WORD,
        CircleAddCommand.COMMAND_WORD,
        CircleRemoveCommand.COMMAND_WORD,
        CircleFilterCommand.COMMAND_WORD,
        ViewCommand.COMMAND_WORD
    );


    private CommandSuggestionUtil() {} // utility class, no instantiation

    /**
     * Returns a suggestion by matching a whitespace-collapsed input prefix against known command words.
     *
     * @param commandWord The first token in the user input.
     * @param arguments The remaining text in the user input.
     * @return An {@code Optional} containing the suggested command word, or {@code Optional.empty()} if none matches.
     */
    public static Optional<String> getSuggestion(String commandWord, String arguments) {
        String noSpaces = (commandWord + arguments).replaceAll("\\s+", "").toLowerCase();
        return KNOWN_COMMANDS.stream()
            .filter(cmd -> noSpaces.startsWith(cmd))
            .findFirst();
    }
}
