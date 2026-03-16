package seedu.address.logic.parser;

import static seedu.address.logic.parser.ParserUtil.parseIndex;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.ViewCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new {@code ViewCommand} object.
 * <p>
 * The parser extracts the index from the user's input and converts it into an
 * {@link Index} object representing the position of the person to be viewed
 * in the currently displayed person list.
 */
public class ViewCommandParser {

    /**
     * Parses the given {@code String} of arguments in the context of the {@code ViewCommand}
     * and returns a {@code ViewCommand} object for execution.
     *
     * @param args User input arguments containing the index of the person to view.
     * @return A {@code ViewCommand} containing the parsed {@link Index}.
     * @throws ParseException If the input does not contain a valid index.
     */
    public ViewCommand parse(String args) throws ParseException {
        Index index = parseIndex(args.trim());
        return new ViewCommand(index);
    }
}
