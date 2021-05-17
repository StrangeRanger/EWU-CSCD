from abc import ABC, abstractmethod


class Command(ABC):
    """Abstract class."""

    @abstractmethod
    def undo(self):
        """Undo an the actions of a specific command."""

    @abstractmethod
    def redo(self):
        """Undo an undo of the actions of a specific command."""
